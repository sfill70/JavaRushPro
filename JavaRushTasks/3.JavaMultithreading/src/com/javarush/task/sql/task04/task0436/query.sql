-- Write your code here:
-- Напиши запрос, который из таблицы employee выберет первые 8 символов позиции (position) сотрудников.



SELECT SUBSTR(position,1,8)
FROM employee;