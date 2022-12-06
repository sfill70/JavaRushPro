-- Write your code here:

-- Напиши запрос, который из таблицы employee выберет позиции (position) и список имен (name)
-- сотрудников на каждой позиции. Используй GROUP_CONCAT.





SELECT position, GROUP_CONCAT(name)
FROM employee
GROUP BY position;
