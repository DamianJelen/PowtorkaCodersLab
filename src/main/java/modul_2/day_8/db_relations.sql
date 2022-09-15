------------------------------------------------------
-- one to one
------------------------------------------------------
-- zad_1
------------------------------------------------------
INSERT INTO clients(id, name, surname) VALUES
(1, 'Damian', 'Jeleń'),
(2, 'Marcel', 'Wrona'),
(3, 'Dorota', 'Dudkiewicz'),
(4, 'Genowefa', 'Pigwa'),
(5, 'Zenon', 'Laskowik'),
(6, 'Anna', 'Przybylska'),
(7, 'Halina', 'Witczyńska');

CREATE TABLE client_address (
    client_id int unsigned not null,
    city varchar(100) not null,
    street varchar(100),
    house_nr varchar(10)
);

INSERT INTO client_address VALUES
(1, 'Warszawa', 'Świętokrzyska', '14'),
(2, 'Poznań', 'Pl. Wytwórców', '14'),
(3, 'Kalisz', 'Potocka', '145'),
(4, 'Kraków', 'Milenijna', '7/13'),
(5, 'Gdańsk', 'Piracka', '37/23'),
(6, 'Krynica Zdrój', 'Świąteczna', '79'),
(7, 'Terka', 'Terkowska', '5');

ALTER TABLE client_address ADD PRIMARY KEY(client_id);
ALTER TABLE clients MODIFY COLUMN id int unsigned;
ALTER TABLE clients ADD PRIMARY KEY(id);
ALTER TABLE client_address ADD FOREIGN KEY(client_id) REFERENCES clients(id);

SELECT *
FROM clients cl INNER JOIN client_address ca on cl.id = ca.client_id

------------------------------------------------------
-- zad_2
------------------------------------------------------
ALTER TABLE tickets MODIFY COLUMN id int unsigned auto_increment, auto_increment=13;
ALTER TABLE payments ADD FOREIGN KEY(ticket_id) REFERENCES tickets(id);

INSERT INTO payments (type, payment_date, ticket_id) VALUES
('cash', '2022-01-25', 1),
('card', '2022-02-11', 2),
('card', '2022-02-25', 3),
('transfer', '2022-03-25', 5),
('cash', '2022-03-25', 8),
('cash', '2022-03-25', 9),
('transfer', '2022-04-04', 10);

SELECT *
FROM payments p INNER JOIN tickets t on p.ticket_id = t.id;

------------------------------------------------------
-- one to many
------------------------------------------------------
-- zad_1
------------------------------------------------------
ALTER TABLE products ADD PRIMARY KEY(id);
ALTER TABLE products MODIFY COLUMN id int unsigned auto_increment;

CREATE TABLE opinions (
                          id int unsigned auto_increment,
                          description varchar(1000),
                          product_id int unsigned NOT NULL,
                          PRIMARY KEY(id),
                          FOREIGN KEY(product_id) REFERENCES products(id)
);

INSERT INTO products(name, description, price) VALUES
('chleb', 'jasny', 2.5),
('chleb', 'ciemny', 5),
('chleb', 'mieszany', 4),
('jajka', '10 szt z wolnego wybiegu', 8.3),
('jajka', '10szt z fermy', 6.9),
('dżem', 'z wiśni', 8.2),
('dżem', 'z truskawek', 7),
('dżem', 'z brzoskwini', 7.5);

INSERT INTO opinions(description, product_id) VALUES
('Świetne jaja, aż mi skwierczą na patelni', 4),
('Jaja idealne na świeta, piękne skorupki', 4),
('Smaczne jajeczka, czuć że z wolnego wybiegu', 4),
('Smaczny chleb i nie kruszy się nastepnego dnia', 1),
('Smacznie, tylko czemu tak drogo?', 3),
('Faktycznie czyje się owoce w tym dżemie', 7),
('Chleb smaczny i za dobrą cenę', 1),
('Świeży chlebek z mlekiem bajeczka', 3);

SELECT CONCAT(p.name, ' - ', p.description) product, o.description
FROM products p INNER JOIN opinions o on p.id = o.product_id
ORDER BY 1;

------------------------------------------------------
-- zad_2
------------------------------------------------------
CREATE TABLE categories (
                            id int auto_increment,
                            name varchar(100),
                            PRIMARY KEY(id)
);

CREATE TABLE categories_sub (
                                id int auto_increment,
                                main_id int,
                                name varchar(100),
                                PRIMARY KEY(id),
                                FOREIGN KEY(main_id) REFERENCES categories(id)
);

------------------------------------------------------
-- many to many
------------------------------------------------------
-- zad_1
------------------------------------------------------
ALTER TABLE orders ADD PRIMARY KEY(id);
ALTER TABLE orders MODIFY COLUMN id int unsigned auto_increment;

INSERT INTO orders(description) VALUES
('Order 1'),
('Order 2'),
('Order 3'),
('Order 4'),
('Order 5'),
('Order 6'),
('Order 7'),
('Order 8'),
('Order 9'),
('Order 10');

CREATE TABLE products_orders (
    id int unsigned auto_increment,
    product_id int unsigned,
    order_id int unsigned,
    PRIMARY KEY(id),
    FOREIGN KEY(product_id) REFERENCES products(id),
    FOREIGN KEY(order_id) REFERENCES orders(id)
);

INSERT INTO products_orders(product_id, order_id) VALUES
(1,1),
(4,1),
(8,1),
(5,2),
(5,3),
(7,3),
(2,4),
(1,5),
(4,5),
(8,5),
(1,6),
(2,6),
(6,6);

SELECT
    o.description,
    p.name,
    p.price
FROM
    orders o INNER JOIN products_orders po on o.id = po.order_id
         INNER JOIN products p on po.product_id = p.id
ORDER BY 1;

------------------------------------------------------
-- zad_2
------------------------------------------------------
CREATE TABLE cinemas_movies (
                                id int unsigned auto_increment,
                                cinema_id int not null,
                                movie_id int not null,
                                PRIMARY KEY(id),
                                FOREIGN KEY(cinema_id) REFERENCES cinemas(id),
                                FOREIGN KEY(movie_id) REFERENCES movies(id)
);

INSERT INTO cinemas_movies(cinema_id, movie_id) VALUES
(1, 2),
(1, 6),
(1, 7),
(1, 9),
(1, 11),
(2, 1),
(2, 2),
(3, 2),
(4, 2),
(2, 5),
(4, 4),
(4, 7),
(3, 11),
(8, 4),
(8, 6),
(8, 9),
(11, 1),
(11, 4),
(11, 5),
(11, 7),
(9, 7),
(9, 6),
(6, 1);

SELECT
    c.name,
    m.title
FROM
    cinemas c INNER JOIN cinemas_movies cm on c.id = cm.cinema_id
              INNER JOIN movies m on cm.movie_id = m.id
ORDER BY 1, 2;