-- Write your code here:
/*В этой задаче тебе потребуется: 1. Выбрать колонку phone из таблицы customers и переименовать
  её в cust_phone (используй оператор AS). Также выбрать колонки order_date, total_cost и store_id
  из таблицы orders. 2. Объединить таблицы customers и orders оператором RIGHT JOIN.
  3. Используя оператор ON, добавить условие, что колонка customer_id таблицы customers
  равнa колонке customer_id таблицы orders.
  4. Используя операторы WHERE и AND, добавить условие, что колонка city таблицы customers
  должна быть равна 'Dallas', а колонка order_status таблицы orders должна быть равна 'PROCESSING'.
  Используй операторы AS, RIGHT JOIN, ON, WHERE и AND.*/



SELECT c.phone AS cust_phone, o.order_date, o.total_cost, o.store_id
FROM customers AS c
         RIGHT JOIN orders AS o
                    ON c.customer_id = o.customer_id
WHERE c.city = 'Dallas'
  AND o.order_status = 'PROCESSING';
