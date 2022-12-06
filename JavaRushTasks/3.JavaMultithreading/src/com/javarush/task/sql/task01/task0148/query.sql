-- Write your code here:
-- Выбрать колонки required, identifier, description (в указанном порядке) из таблицы parts,
-- у которых значение поля description не равное NULL

select required, identifier, description from parts WHERE description IS NOT NULL;
