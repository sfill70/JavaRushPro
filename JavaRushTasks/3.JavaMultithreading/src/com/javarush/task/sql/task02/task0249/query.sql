-- Write your code here:
/*Напиши запрос, который из таблицы employee выберет департамент (department),
  позицию (position) и количество сотрудников в данном департаменте на позиции 'backend developer'.
  В выборку должны попасть только данные с количеством равным 1.
  Для количества используй алиас total и этот алиас используй для проверки условия.
  Все проверки выполняй с помощью оператора HAVING.*/



SELECT department, position, count(*) AS total
FROM employee
GROUP BY department, position
HAVING position = 'backend developer'
   AND total = 1;