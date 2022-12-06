-- Write your code here:
-- Требуется найти все записи из таблиц gyms и customers, где location равно London. Используй WHERE.


SELECT *
FROM gyms,
     customers
WHERE gyms.location = 'London'
  AND customers.location = 'London';

