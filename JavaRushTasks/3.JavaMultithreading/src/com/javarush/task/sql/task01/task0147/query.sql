-- Write your code here:
-- Выбрать колонки required, identifier, description (в указанном порядке) из таблицы parts,
-- у которых значение поля description равное NULL ИЛИ значение поля required равное true


select required, identifier, description from parts WHERE description IS NULL OR required = true;
