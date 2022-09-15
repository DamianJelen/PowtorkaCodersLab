---------------------------------------------------
-- zad_1
---------------------------------------------------
1. SELECT *
   FROM users
   WHERE name LIKE '%Julia %';
2. SELECT *
   FROM users
   ORDER BY email DESC
   LIMIT 5;
3. SELECT *
   FROM users
   WHERE
     email LIKE '%yahoo.com'
     AND name LIKE 'L%';
4. SELECT *
   FROM users
   HAVING SHA2(name + users.salt, 256) = password;
5. SELECT id, title
   FROM offers
   WHERE price > 500000;
6. SELECT id, price
   FROM offers
   WHERE
     activation_token = ''
     AND price BETWEEN 80000 AND 400000;
7. SELECT
       title,
       price,
       phone
   FROM offers
   WHERE
     expire > CURRENT_TIMESTAMP
     AND TIMESTAMPDIFF(DAY, expire, promoted_to) < 10;
8. SELECT *
   FROM offers
   WHERE
     description LIKE '%violent%'
     AND phone LIKE '%2%'
     AND price > 50000;
9. SELECT *
   FROM offers
   WHERE
     promoted = 0
     AND price < 300000
     AND title LIKE '%PLC';
10. SELECT *
    FROM offers
    WHERE
      price * 2 < 50000
      AND promoted = 1
      AND promoted_to > CURRENT_TIMESTAMP;
11. SELECT COUNT(*) sum_active
    FROM offers
    WHERE
      expire > CURRENT_TIMESTAMP
      AND status > 0;
12. SELECT owner, COUNT(*) sum_user
    FROM offers
    WHERE
      expire > CURRENT_TIMESTAMP
      AND status > 0
    GROUP BY owner;
13. SELECT status, COUNT(*) counter
    FROM offers
    WHERE status > 0
    GROUP BY status;
14. SELECT SUM(price) sum_nonactive_nopromoted
    FROM offers
    WHERE
      status = 1
      AND promoted = 0;
15. SELECT ROUND(AVG(price), 2) avg_price
    FROM offers
    WHERE
      expire > current_timestamp
      AND promoted = 1
      AND price > 44645.04;

---------------------------------------------------
-- zad_2
---------------------------------------------------
