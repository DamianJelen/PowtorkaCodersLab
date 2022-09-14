-------------------------------------------------------------
zad_2
-------------------------------------------------------------
1. SELECT COUNT(*) COUNT_ALL_TICKETS
   FROM tickets;
2. SELECT type, COUNT(*) COUNT_ALL_PAYMENTS_BY_TYPE
   FROM payments
   GROUP BY type;
3. SELECT AVG(price) AVG_PRICE
   FROM tickets;
4. SELECT *
   FROM payments LIMIT 2, 5;
5. SELECT type, COUNT(*) COUNT_ALL_PAYM_BY_TYPE
   FROM payments
   GROUP BY type
   HAVING COUNT_ALL_PAYM_BY_TYPE >= 2;
6. SELECT SUM(quantity)
   FROM tickets
   WHERE price > 23.15;

-------------------------------------------------------------
zad_3
-------------------------------------------------------------
1. SELECT *
   FROM movies
   WHERE title LIKE  'S%';
2. SELECT *
   FROM tickets
   WHERE price > 15.3;
3. SELECT *
   FROM tickets
   WHERE quantity > 300;
4. SELECT *
   FROM movies
   WHERE rating > 6.5;
5. SELECT *
   FROM movies
   ORDER BY rating DESC
   LIMIT 3;

-------------------------------------------------------------
zad_4
-------------------------------------------------------------
1. UPDATE cinemas
   SET address = 'Stadion Narodowy'
   WHERE name LIKE 'Praha';
2. DELETE FROM payments
   WHERE TIMESTAMPDIFF(DAY, payment_date, TIMESTAMP('2017-02-24')) > 4;
3. UPDATE movies
   SET rating
   WHERE LENGTH(description) > 40;
4. UPDATE tickets
   SET price = ROUND(price / 2, 2)
   WHERE quantity > 300;