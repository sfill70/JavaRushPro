-- Write your code here:
/*В этой задаче тебе потребуется: 1. Выбрать колонки customer_id и email из таблицы customers
  и колонки order_id и order_status из таблицы orders.
  2. Объединить таблицы customers и orders оператором JOIN, но при этом через оператор
  AS временно заменить название таблицы customers на c, а таблицы orders на o.
  3. Используя оператор ON, добавить условие, что колонка customer_id таблицы customers
  равнa колонке customer_id таблицы orders. 4. Используя оператор WHERE, добавить условие,
  что order_status таблицы orders должно содержать 'PAID' или (используй OR) 'PROCESSING'.
  Используй операторы JOIN, ON, AS, WHERE и OR.*/



SELECT c.customer_id, c.email, o.order_id, o.order_status
FROM customers AS c
         JOIN orders AS o
              ON c.customer_id = o.customer_id
WHERE o.order_status = 'PAID'
   OR o.order_status = 'PROCESSING';


