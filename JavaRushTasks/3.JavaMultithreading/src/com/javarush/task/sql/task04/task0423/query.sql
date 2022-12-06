-- Write your code here:
-- Напиши запрос, который из таблицы employee выберет имя (name)
-- и позицию (position) сотрудников, которые родились в понедельник.
-- Используй DAYNAME().


SELECT name, position FROM employee WHERE DAYNAME(date_of_birth) = 'Monday';