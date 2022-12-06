-- Write your code here:
-- Напиши запрос, который из таблицы employee выберет департамент (department),
-- позицию (position) и количество сотрудников в данном департаменте на данной позиции.
-- В выборку должны попасть только данные с количеством более 1 и менее 4.
-- Для количества используй алиас total и этот алиас используй для проверки условия.


SELECT department, position, count(*) AS total
FROM employee
GROUP BY department, position
HAVING total > 1
    AND total < 4;
