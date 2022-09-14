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