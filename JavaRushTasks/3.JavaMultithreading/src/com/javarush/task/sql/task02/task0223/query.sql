-- Write your code here:
-- Напиши запрос, который из таблицы employee выберет информацию о том,
-- сколько в каждом департаменте (department) сотрудников.


SELECT department, COUNT(*)
FROM employee GROUP BY department;
