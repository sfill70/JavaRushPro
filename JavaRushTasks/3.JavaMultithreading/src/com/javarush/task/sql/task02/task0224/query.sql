-- Write your code here:
-- Напиши запрос, который из таблицы employee выберет информацию о том,
-- сколько в каждом департаменте (department)
-- сотрудников со специальностью (position) 'backend developer'.


SELECT department, count(*)
FROM employee
WHERE position = 'backend developer'
GROUP BY department;
