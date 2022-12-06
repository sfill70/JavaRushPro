-- Write your code here:
-- Выбрать колонки country_code, ip_from, ip_to (в указанном порядке) из таблицы ip2country у
-- которых country_code равен DE При выборе пропустить первых 3 строки. Выбрать нужно только 5 строк.
-- Нужно использовать: WHERE, LIMIT и OFFSET


SELECT country_code, ip_from, ip_to FROM  ip2country WHERE country_code = 'DE' LIMIT 5 OFFSET 3;

