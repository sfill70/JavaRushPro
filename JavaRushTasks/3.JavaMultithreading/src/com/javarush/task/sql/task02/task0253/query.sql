-- Write your code here:
/*Напиши запрос, который из таблицы автомобилей (cars) выберет название (name) и сумму стоимостей (price).
  В результат должны попасть только те авто, сумма стоимостей которых более 200000.*/



SELECT name, sum(price)
FROM cars
GROUP BY name
HAVING sum(price) > 200000;
