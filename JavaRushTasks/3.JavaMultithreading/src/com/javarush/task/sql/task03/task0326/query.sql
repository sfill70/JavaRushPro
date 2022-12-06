-- Write your code here:
/*В этой задаче тебе потребуется: 1. Выбрать колонку email из таблицы customers и все
  колонки из таблицы orders. 2. Объединить таблицы customers и orders оператором RIGHT JOIN.
  3. Используя оператор ON, добавить условие, что колонка customer_id таблицы customers
  равнa колонке customer_id таблицы orders. Используй операторы RIGHT JOIN и ON.*/





SELECT c.email, o.*,
FROM customers AS c
         RIGHT JOIN orders AS o
                   ON c.customer_id = o.customer_id;
