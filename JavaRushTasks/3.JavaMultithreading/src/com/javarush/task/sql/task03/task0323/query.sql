-- Write your code here:
/*В этой задаче тебе потребуется: 1. Выбрать колонку last_name из таблицы customers,
  временно изменив название на surname (используй AS) и колонку order_id из таблицы orders.
  2. Объединить таблицы customers и orders оператором LEFT JOIN.
  3. Используя оператор ON, добавить условие, что колонка customer_id таблицы customers
  равнa колонке customer_id таблицы orders. Используй операторы LEFT JOIN, AS и ON.*/



SELECT surname.last_name, orders.order_id,
FROM customers AS surname
         LEFT JOIN orders
                   ON surname.customer_id = orders.customer_id;