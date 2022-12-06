-- Write your code here:
-- Выбрать колонки id, identifier, description (в указанном порядке) из таблицы parts.
-- Результат отсортируй по полю identifier по убыванию, по полю required по убыванию и
-- по полю description по возрастанию. Нужно использовать: ORDER BY, DESC, ASC

select id, identifier, description from parts ORDER BY identifier DESC, description ASC;