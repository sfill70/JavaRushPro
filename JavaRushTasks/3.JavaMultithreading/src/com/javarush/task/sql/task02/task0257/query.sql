-- Write your code here:
/*Напиши запрос, который из таблицы автомобилей (cars) выберет название (name),
  среднюю и суммарную стоимость (price). В результат должны попасть только те авто,
  средняя стоимость которых более 100000.*/





SELECT name, avg(price), sum(price)
FROM cars
GROUP BY name
HAVING avg(price) > 100000;