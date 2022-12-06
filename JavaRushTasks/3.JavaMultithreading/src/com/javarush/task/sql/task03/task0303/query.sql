-- Write your code here:
-- Требуется найти все записи из таблиц gyms и customers,
-- где name из таблицы gyms равно name из таблицы customers. Используй WHERE.





SELECT *
FROM gyms,
     customers
WHERE gyms.name = customers.name;
