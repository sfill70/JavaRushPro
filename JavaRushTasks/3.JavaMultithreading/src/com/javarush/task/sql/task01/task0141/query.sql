-- Write your code here:
-- Выбрать все колонки (используй *) из таблицы parts. Результат отсортируй по полю required по убыванию,
-- и по полю id по возрастанию. Нужно использовать: ORDER BY, DESC, ASC



SELECT * FROM parts ORDER BY required DESC, id ASC;