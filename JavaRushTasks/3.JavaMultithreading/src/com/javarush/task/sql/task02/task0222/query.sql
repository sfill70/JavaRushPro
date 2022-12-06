-- Write your code here:
-- Напиши запрос, который из таблицы cars выберет информацию о том,
-- сколько каких названий (name) автомобилей есть в наличии.


SELECT name, COUNT(*)
FROM cars GROUP BY name;
