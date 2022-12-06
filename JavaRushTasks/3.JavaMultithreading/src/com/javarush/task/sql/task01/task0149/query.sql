-- Write your code here:
-- Выбрать все колонки (используй *) из таблицы parts, у которых значение поля description
-- не равное NULL или значение поля identifier равное NULL




select * from parts WHERE description IS NOT NULL OR identifier IS NULL;