-- Write your code here:
/*Напиши запрос, который из таблицы автомобилей (cars) выберет название (name),
  минимальную и максимальную стоимость (price).*/



SELECT name, min(price), max(price)
FROM cars
GROUP BY name;


