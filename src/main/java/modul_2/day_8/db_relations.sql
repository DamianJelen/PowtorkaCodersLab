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
ALTER TABLE payments ADD ticket_id int unsigned;
ALTER TABLE tickets MODIFY COLUMN id int unsigned auto_increment, auto_increment=13;
ALTER TABLE payments ADD FOREIGN KEY(ticket_id) REFERENCES tickets(id);

INSERT INTO payments (type, payment_date, ticket_id) VALUES
('cash', '2022-01-25', 1),
('card', '2022-02-11', 2),
('card', '2022-02-25', 3),
('transfer', '2022-03-25', 5),
('cash', '2022-03-25', 8),
('cash', '2022-03-25', 9),
('transfer', '2022-04-04', 10),
('transfer', '2022-04-17', 12);

SELECT *
FROM payments p INNER JOIN tickets t on p.ticket_id = t.id;