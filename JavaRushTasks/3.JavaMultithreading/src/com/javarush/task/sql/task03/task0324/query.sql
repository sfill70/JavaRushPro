-- Write your code here:
/*В этой задаче тебе потребуется: 1. Выбрать колонку customer_id из таблицы customers
  и колонку order_id из таблицы orders. 2. Объединить таблицы customers и orders оператором LEFT JOIN,
  заменив их имена на c и o, соответственно, используя оператор AS.
  3. Используя оператор ON, добавить условие, что колонка customer_id таблицы customers
  равнa колонке customer_id таблицы orders. 4. Используя оператор WHERE, добавить условие,
  что shipped_date таблицы orders IS NULL. Используй операторы LEFT JOIN, AS, ON и IS NULL.*/



SELECT c.customer_id, o.order_id,
FROM customers AS c
         LEFT JOIN orders AS o
                   ON c.customer_id = o.customer_id
WHERE o.shipped_date IS NULL;
