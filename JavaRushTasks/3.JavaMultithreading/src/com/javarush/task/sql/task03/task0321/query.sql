-- Write your code here:
/*В этой задаче тебе потребуется: 1. Выбрать все колонки таблицы customers и соединить её
  с таблицей orders используя оператор JOIN. 2. Добавить условие, что колонка customer_id таблицы
  customers равнa колонке customer_id таблицы orders.
  3. Добавить условие, что total_cost таблицы orders должно быть больше 100. Используй операторы JOIN,
  ON и WHERE.*/



SELECT * FROM customers
                  JOIN orders ON customers.customer_id = orders.customer_id
WHERE orders.total_cost > 100;