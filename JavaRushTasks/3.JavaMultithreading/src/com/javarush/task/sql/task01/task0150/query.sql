-- Write your code here:
-- Выбрать все колонки (используй *) из таблицы parts, у которых значение поля id между 7 и 23
-- включительно И значение поля identifier равное NULL. Выбрать только первых 2 записи


select * from parts WHERE id BETWEEN 7 AND 23 AND identifier IS NULL LIMIT 2