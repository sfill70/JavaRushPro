-- Write your code here:
# Добавь в таблицу customers все колонки таблицы suppliers.
INSERT INTO customers
SELECT * FROM suppliers;