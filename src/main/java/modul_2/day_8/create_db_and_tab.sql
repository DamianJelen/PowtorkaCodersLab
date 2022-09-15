-----------------------------------------------------------------
zad_1
-----------------------------------------------------------------
CREATE DATABASE dj_products
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;

----------------------------------------------------------------
zad_2
----------------------------------------------------------------
CREATE TABLE products (
    id int,
    name varchar(100),
    description varchar(1000),
    price decimal(10, 2)
);

CREATE TABLE orders (
    id int,
    description varchar(1000)
);

CREATE TABLE clients (
    id int,
    name varchar(100),
    surname varchar(100)
);

--------------------------------------------------------------
zad_3
--------------------------------------------------------------
CREATE DATABASE dj_cinemas
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;

--------------------------------------------------------------
zad_4
--------------------------------------------------------------
CREATE TABLE  cinemas (
    id int unsigned auto_increment,
    name varchar(100) not null,
    address varchar(200),
    PRIMARY KEY(id)
);

CREATE TABLE movies (
    id int unsigned auto_increment,
    title varchar(100) not null,
    description varchar(1000),
    rating decimal(5,2),
    PRIMARY KEY(id)
);

CREATE TABLE tickets (
    id int unsigned auto_increment,
    quantity tinyint not null,
    price decimal(6,2) not null,
    status tinyint default 0,
    PRIMARY KEY(id)
);

CREATE TABLE payments (
    id int unsigned auto_increment,
    type char(10),
    payment_date date,
    PRIMARY KEY(id)
);

----------------------------------------------------------------
zad_5
----------------------------------------------------------------
CREATE TABLE images (
    id int unsigned auto_increment,
    offer_id int unsigned,
    src varchar(100),
    dimension mediumblob,
    PRIMARY KEY(id),
    FOREIGN KEY(offer_id) REFERENCES offers(id)
);

INSERT INTO images(offer_id, src, dimension) VALUES
(15, 'src to image 1', 'dimension 1'),
(67, 'src to image 2', 'dimension 2'),
(29, 'src to image 3', 'dimension 3'),
(8, 'src to image 4', 'dimension 4'),
(21, 'src to image 5', 'dimension 5'),
(59, 'src to image 6', 'dimension 6'),
(63, 'src to image 7', 'dimension 7'),
(33, 'src to image 8', 'dimension 8');

CREATE TABLE users_companies (
                                 id int unsigned auto_increment,
                                 user_id int unsigned unique,
                                 name varchar(300),
                                 nip int,
                                 street varchar(50),
                                 street_nr mediumint,
                                 phone char(9),
                                 post_code char(6),
                                 capital decimal(7,2),
                                 rate decimal(5,4),
                                 created_at datetime,
                                 PRIMARY KEY(id),
                                 FOREIGN KEY(user_id) REFERENCES users(id)
);

INSERT INTO users_companies(user_id, name, nip, street, street_nr, phone, post_code, capital, rate, created_at) VALUES
(42, 'Damian Jelen', 1234515391, 'street 1', 1, '234234234', '00-678', 12034.73, 4.3555, '2022-03-25 10:00:01'),
(3, 'Zbigniew Oczko', 122346789, 'street 2', 27, '231234234', '01-178', 12134.45, 1.3555, '2022-05-05 20:01:20'),
(44, 'Krystyna Janik', 1238458789, 'street 3', 10, '234987234', '02-278', 12034.11, 2.2555, '2022-06-23 13:10:01'),
(35, 'Albert Bryndza', 0879667891, 'street 4', 5, '234230904', '05-368', 13034.54, 2.2155, '2022-01-06 10:43:44'),
(46, 'Monika Dzika', 1023432546, 'street 5', 32, '234234114', '03-378', 10644.93, 1.2555, '2022-01-17 12:34:21'),
(27, 'Anna Majdak', 1233441144, 'street 6', 43, '238844234', '00-358', 20324.78, 1.5555, '2022-02-28 17:12:02'),
(48, 'Karolina Sobczak', 1112223334, 'street 7', 5, '298094234', '04-378', 10334.13, 1.3555, '2022-04-30 19:09:43'),
(19, 'Marian Owad', 328978799, 'street 7', 103, '234100234', '10-378', 10266.32, 1.3555, '2022-03-09 19:05:00');