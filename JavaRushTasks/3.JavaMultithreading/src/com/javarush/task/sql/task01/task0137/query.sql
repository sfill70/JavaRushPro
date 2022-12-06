-- Write your code here:
-- Выбрать все уникальные значения колонки country_name из таблицы ip2country,
-- у которых в названии (колонка country_name) нет символа пробел. Нужно использовать:
-- DISTINCT, WHERE и NOT LIKE


SELECT DISTINCT country_name FROM  ip2country WHERE country_name NOT LIKE '% %';