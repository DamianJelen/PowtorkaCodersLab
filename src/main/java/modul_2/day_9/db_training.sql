------------------------------------------------------------
-- zad_1
------------------------------------------------------------
1. UPDATE offers
   SET price = price + 1000
   WHERE id BETWEEN 20 AND 25;
2. DELETE FROM offers
   WHERE expire < TIMESTAMPADD(DAY, -3, NOW());
3. DELETE FROM offers
   WHERE
    phone LIKE '+48%'
    AND promoted = 1
    AND expire > NOW()
    AND status = 2;
4. UPDATE offers
   SET promoted = 1, promoted_to = TIMESTAMPADD(DAY, 23, promoted_to)
   WHERE
    SUBSTRING(REPLACE(REPLACE(REPLACE(REPLACE(phone, '+', ''),'(',''),')', ''), ' ', ''), 3, 2) = '48'
    AND promoted = 0;
5. UPDATE offers
   SET description = REPLACE(description, 'executed', 'found')
   WHERE
       (phone LIKE '%(%'
           OR phone LIKE '%)%')
     AND price > 400000;

------------------------------------------------------------
-- zad_2
------------------------------------------------------------
CREATE TABLE screenings (
    id int auto_increment,
    cinema_id int,
    movie_id int,
    show_time datetime,
    PRIMARY KEY(id),
    FOREIGN KEY(cinema_id) REFERENCES cinemas(id),
    FOREIGN KEY(movie_id) REFERENCES movies(id)
);

------------------------------------------------------------
-- zad_3
------------------------------------------------------------
SELECT
    m.description,
    m.rating,
    c.name
FROM
    movies m INNER JOIN cinemas_movies cm on m.id = cm.movie_id
             INNER JOIN cinemas c on cm.cinema_id = c.id;
