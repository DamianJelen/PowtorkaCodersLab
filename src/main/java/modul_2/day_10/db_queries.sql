---------------------------------------
-- 1
---------------------------------------
create database dj_workshop
CHARACTER SET utf8mb4
COLLATE utf8mb4_polish_ci;
---------------------------------------
-- 2
---------------------------------------
CREATE TABLE users (
    id int unsigned auto_increment,
    email varchar(255) UNIQUE NOT NULL,
    username varchar(255) NOT NULL,
    def_1 varchar(50) NOT NULL,
    PRIMARY KEY(id)
);
---------------------------------------
-- 3
---------------------------------------
INSERT INTO users(email, username, def_1) VALUE (?, ?, ?);
UPDATE users
SET email = ?, username = ?, def_1 = ?
WHERE id = ?;
DELETE FROM users
WHERE id = ?;
SELECT * FROM users;
SELECT * FROM users WHERE id = ?;
