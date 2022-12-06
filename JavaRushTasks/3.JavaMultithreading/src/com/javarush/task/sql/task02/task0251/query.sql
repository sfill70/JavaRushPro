-- Write your code here:
/*Напиши запрос, который из таблицы employee выберет два департамента (department),
  позиции (position) и количество сотрудников в данных департаментах.
  В выборку должны попасть только данные с количеством равным 1 или с позицией 'manager'.
  Первую строку результата нужно пропустить. Всего две строки. Для количества используй алиас total и этот алиас
  используй для проверки условия. Все проверки выполняй с помощью оператора HAVING.*/


/*SELECT department, position, count(*) AS total
FROM employee
GROUP BY department, position
HAVING position = 'manager'
   OR total = 1 LIMIT 1;*/

SELECT department, position, count(*) AS total
FROM employee
GROUP BY department, position
HAVING total = 1
    OR position = 'manager' LIMIT 2
OFFSET 1
