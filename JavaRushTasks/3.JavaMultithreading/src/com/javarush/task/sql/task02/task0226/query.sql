-- Write your code here:
-- Напиши запрос, который из таблицы cars выберет информацию о том,
-- сколько каких автомобилей (name) было выпущено в 2021 году (prod_year).


SELECT name, count(*)
FROM cars
WHERE prod_year = 2021
GROUP BY name;
