-- Write your code here:
-- Выбрать колонки country_code, ip_from, ip_to (в указанном порядке) из таблицы ip2country.
-- При выборе пропустить первых 78 строк. Нужно использовать: OFFSET


SELECT country_code, ip_from, ip_to FROM ip2country OFFSET 78;
