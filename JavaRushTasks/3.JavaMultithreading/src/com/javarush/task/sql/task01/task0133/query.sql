-- Write your code here:
-- Выбрать колонки country_code, ip_from, ip_to (в указанном порядке) из таблицы ip2country.
-- При выборе пропустить первых 33 строки. Выбрать нужно только 12 строк. Нужно использовать:
-- LIMIT и OFFSET


SELECT country_code, ip_from, ip_to FROM ip2country LIMIT 12 OFFSET 33;
