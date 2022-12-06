-- Write your code here:
-- Выбрать все колонки (используй *) из таблицы parts,
-- у которых значение поля description равное NULL И значение поля required равное true

select * from parts WHERE description IS NULL AND required = true;
