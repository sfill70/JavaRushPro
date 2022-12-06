-- Write your code here:
-- Напиши запрос, который из таблицы cars выберет информацию о том,
-- сколько синих автомобилей (name равен 'Blue Car') выпущено в каждом году (prod_year),
-- в котором они выпускались.


SELECT prod_year, count(*)
FROM cars
WHERE name = 'Blue Car'
GROUP BY prod_year;
