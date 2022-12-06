-- Write your code here:
/*Напиши запрос, который из таблицы автомобилей (cars) выберет название (name),
  минимальную и максимальную стоимость (price). В результат должны попасть только те авто,
  максимальная стоимость которых менее 200000.*/



SELECT name, min(price), max(price)
FROM cars
GROUP BY name
HAVING max(price) < 200000;


