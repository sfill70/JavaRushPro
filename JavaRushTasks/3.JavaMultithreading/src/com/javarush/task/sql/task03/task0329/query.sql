-- Write your code here:

/*В этой задаче тебе потребуется: 1. Выбрать колонку customer_id из таблицы customers
  и колонку order_status из таблицы orders. 2. Объединить таблицы customers и orders оператором JOIN,
  при этом изменив их названия на c и o, соответственно (используя оператор AS).
  3. Используя оператор ON, добавить условие, что колонка customer_id таблицы customers
  равнa колонке customer_id таблицы orders. Используй операторы JOIN, ON и AS.*/



SELECT c.customer_id, o.order_status,
FROM customers AS c
         RIGHT JOIN orders AS o
                    ON c.customer_id = o.customer_id;
