-- Write your code here:

/*Напиши запрос, который из таблицы employee выберет один департамент (department),
  позицию (position) и количество сотрудников в данном департаменте на позиции 'frontend developer'.
  В выборку должны попасть только данные с количеством более 1.
  Для количества используй алиас total и этот алиас используй для проверки условия. ТОлько одну строку.
  Все проверки выполняй с помощью оператора HAVING.*/


/*SELECT department, position, count(*) AS total
FROM employee
GROUP BY department, position
HAVING position = 'frontend developer'
   AND total > 1;*/

SELECT department, position, count(*) AS total
FROM employee
GROUP BY department, position
HAVING position = 'frontend developer'
   AND total > 1 LIMIT 1;
