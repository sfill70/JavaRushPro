-- Write your code here:
-- Выбрать колонку description из таблицы parts. Результат отсортируй по полю required по убыванию,
-- по полю identifier по убыванию и по полю description по убыванию. Пропусти первых 23 строки.
-- Нужно использовать: ORDER BY, DESC, OFFSET

select description from parts ORDER BY required DESC, identifier DESC, description DESC OFFSET 23;
