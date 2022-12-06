-- Write your code here:
-- Выбрать колонки id, identifier, description (в указанном порядке) из таблицы parts.
-- Результат отсортируй по полю identifier по возрастанию, по полю required по убыванию
-- и по полю description по убыванию. Выбрать только первых 7 строк. Нужно использовать:
-- ORDER BY, DESC, ASC, LIMIT


select id, identifier, description from parts ORDER BY identifier ASC, required DESC LIMIT 7;