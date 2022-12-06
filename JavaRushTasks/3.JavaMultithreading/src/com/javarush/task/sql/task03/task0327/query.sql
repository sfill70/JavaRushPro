-- Write your code here:
/*В этой задаче тебе потребуется: 1. Выбрать колонку city из таблицы customers и колонку
  store_id из таблицы orders. 2. Объединить таблицы customers и orders оператором RIGHT JOIN.
  3. Используя оператор ON, добавить условие, что колонка customer_id таблицы customers
  равнa колонке customer_id таблицы orders. 4. Используя операторы WHERE и AND,
  добавить условие, что order_status и total_cost таблицы orders должны быть равны 'SHIPPED'
  и больше 100, соответственно. Используй операторы RIGHT JOIN, ON, WHERE и AND.*/



SELECT c.city, o.store_id,
FROM customers AS c
         RIGHT JOIN orders AS o
                    ON c.customer_id = o.customer_id
WHERE o.order_status = 'SHIPPED'
  AND o.total_cost > 100;
