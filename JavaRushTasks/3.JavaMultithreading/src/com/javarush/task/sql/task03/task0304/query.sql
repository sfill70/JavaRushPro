-- Write your code here:
-- Требуется найти колонки name и location из таблицы gyms, и колонки sex и location из таблицы customers.


SELECT gyms.name, gyms.location, customers.sex, customers.location
FROM gyms,
     customers;
