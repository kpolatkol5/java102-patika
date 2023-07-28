-- CREATE TABLE employee (id SERIAL PRIMARY KEY , name VARCHAR (50) , birthday  DATE ,email VARCHAR(100)) 

-- UPDATE employee SET name = 'kadir' WHERE id=2
-- UPDATE employee SET birthday = '2002-08-08' WHERE name ILIKE 'ra%'
-- UPDATE employee SET email = 'test@test.com' WHERE 	birthday  > '2006-10-22'
-- UPDATE employee SET birthday = '2023-07-28' WHERE 	birthday  > '2006-10-22'
-- UPDATE employee SET name  = 'RETURNING' WHERE LENGTH(email ) > 25 RETURNING *;




-- DELETE FROM  employee WHERE id = 4;
-- DELETE FROM  employee WHERE birthday >  '2023-5-12';
-- DELETE FROM  employee WHERE name LIKE '%e';
-- DELETE FROM  employee WHERE NOT email ILIKE '%@%';
-- DELETE FROM  employee;
