-- Write your code here:
-- Выбрать колонки country_code, ip_from, ip_to (в указанном порядке) из таблицы ip2country.
-- Результат отсортируй по колонке ip_from в возрастающем порядке. Выбрать нужно только 17 строк.
-- Нужно использовать: ORDER BY, ASC, LIMIT


SELECT country_code, ip_from, ip_to FROM  ip2country ORDER BY ip_from ASC LIMIT 17;
