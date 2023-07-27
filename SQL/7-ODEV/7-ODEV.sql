-- SELECT rating , COUNT(*) as rating_count FROM film GROUP BY rating;

-- SELECT replacement_cost  , COUNT(*) as replacement_cost_count FROM film GROUP BY replacement_cost HAVING COUNT(replacement_cost) > 50  ;

-- SELECT store_id , COUNT(*) AS customer_count FROM customer GROUP BY store_id

SELECT country_id  , COUNT(*) AS cityCount FROM city GROUP BY country_id ORDER BY  COUNT(country_id) DESC LIMIT 1;

 
