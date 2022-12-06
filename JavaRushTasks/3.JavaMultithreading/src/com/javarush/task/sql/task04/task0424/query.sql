-- Write your code here:
-- Напиши запрос, который из таблицы employee выберет имя (name) и
-- департамент (department) сотрудников, которые родились в первые 200 дней года.


SELECT name, department FROM employee WHERE DAYOFYEAR(date_of_birth) <= 200;
