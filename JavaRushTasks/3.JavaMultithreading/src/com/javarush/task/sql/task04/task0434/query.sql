-- Write your code here:
-- Напиши запрос, который из таблицы employee выберет длины имен (name) сотрудников в байтах и символах.


SELECT LENGTH(name), CHAR_LENGTH(name)
FROM employee;
