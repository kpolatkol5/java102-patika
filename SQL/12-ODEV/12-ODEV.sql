-- SELECT (SELECT AVG(length) FROM film) AS "ORTLAMA " ,(SELECT  COUNT(*) FROM film WHERE  length > (SELECT AVG(length) FROM film)) as "sayi" FROM film LIMIT 1;
--  SELECT COUNT(*) FROM film WHERE rental_rate =  (SELECT MAX(rental_rate) FROM film) 
-- SELECT * FROM film	WHERE rental_rate = (SELECT MIN(rental_rate) FROM film) AND replacement_cost = (SELECT MIN(replacement_cost) FROM film) 

SELECT * FROM customer WHERE customer_id = ANY (SELECT  customer_id  FROM  payment GROUP BY customer_id ORDER BY COUNT(*))