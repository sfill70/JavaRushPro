-- Write your code here:
-- Выбрать колонки ip_from, ip_to, country_name (в указанном порядке) из таблицы ip2country.
-- Результат отсортируй по колонке ip_to в убывающем порядке. При выборе пропустить первых 74 строки.
-- Нужно использовать: ORDER BY, DESC, OFFSET


SELECT ip_from, ip_to, country_name FROM  ip2country ORDER BY ip_to DESC OFFSET 74;
