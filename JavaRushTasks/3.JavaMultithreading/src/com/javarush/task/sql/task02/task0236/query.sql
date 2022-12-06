-- Write your code here:

-- Напиши запрос, который из таблицы employee выберет информацию о том,
-- сколько сотрудников в определенном департаменте (department) в
-- определенной должности (position).


SELECT department, position, count(*)
FROM employee
GROUP BY department, position;

