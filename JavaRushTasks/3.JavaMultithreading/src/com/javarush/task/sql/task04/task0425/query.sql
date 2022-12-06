-- Write your code here:
-- Напиши запрос, который из таблицы employee выберет год, месяц согласно даты
-- рождения (date_of_birth) и количество сотрудников, которые родились
-- в этот год и месяц.


SELECT YEAR (date_of_birth), MONTH (date_of_birth), count (*)
FROM employee
GROUP BY YEAR (date_of_birth), MONTH (date_of_birth);