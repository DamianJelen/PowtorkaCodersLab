---------------------------------------------------------------
-- zad_1
---------------------------------------------------------------
1. SELECT t.*
   FROM tickets t INNER JOIN payments p on t.id = p.id
   WHERE p.type = 'cash';
2. SELECT t.*
   FROM tickets t LEFT JOIN payments p on t.id = p.id
   WHERE p.id is null;

---------------------------------------------------------------
-- zad_2
---------------------------------------------------------------
1. SELECT o.*, p.id product_id
   FROM
    orders o INNER JOIN products_orders po on o.id = po.order_id
        INNER JOIN products p on po.product_id = p.id
   WHERE p.id = 1
2. SELECT p.*, o.id order_id
   FROM
    orders o INNER JOIN products_orders po on o.id = po.order_id
        INNER JOIN products p on po.product_id = p.id
   WHERE o.id = 1;

---------------------------------------------------------------
-- zad_3
---------------------------------------------------------------
1. SELECT p.*, o.*
   FROM products p INNER JOIN opinions o on p.id = o.product_id;
2. SELECT p.*, o.*
   FROM products p LEFT JOIN opinions o on p.id = o.product_id;
3. SELECT o.*
   FROM opinions o
   WHERE o.product_id = 1;

---------------------------------------------------------------
-- zad_4
---------------------------------------------------------------
1. SELECT cs.*
   FROM categories_sub cs INNER JOIN categories c on cs.main_id = c.id
   WHERE c.id = 1;
2. SELECT DISTINCT c.id, c.name
   FROM categories_sub cs INNER JOIN categories c on cs.main_id = c.id;

---------------------------------------------------------------
-- zad_5
---------------------------------------------------------------
1. SELECT c.*
   FROM
    cinemas c INNER JOIN cinemas_movies cm on c.id = cm.cinema_id
        INNER JOIN movies m on cm.movie_id = m.id
   WHERE m.id = 1;
2. SELECT m.*
   FROM
    cinemas c INNER JOIN cinemas_movies cm on c.id = cm.cinema_id
        INNER JOIN movies m on cm.movie_id = m.id
   WHERE c.id = 1;