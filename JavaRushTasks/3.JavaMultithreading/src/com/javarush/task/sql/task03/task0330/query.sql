-- Write your code here:
/*В этой задаче тебе потребуется: 1. Выбрать колонку zip_code из таблицы customers,
  переименовав её в cust_zip_code, и колонку order_status из таблицы orders,
  переименовав её в status. 2. Объединить таблицы customers и orders оператором LEFT JOIN.
  3. Используя оператор ON, добавить условие, что колонка customer_id таблицы customers
  равнa колонке customer_id таблицы orders. Используй операторы LEFT JOIN, ON и AS.*/



SELECT c.zip_code AS cust_zip_code, o.order_status AS status,
FROM customers AS c
         LEFT JOIN orders AS o
                   ON c.customer_id = o.customer_id;
