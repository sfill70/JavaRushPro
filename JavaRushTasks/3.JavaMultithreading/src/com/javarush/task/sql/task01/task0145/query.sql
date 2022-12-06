-- Write your code here:
-- Выбрать все колонки (используй *) из таблицы parts, у которых значение поля description равное NULL


select * from parts WHERE description IS NULL;