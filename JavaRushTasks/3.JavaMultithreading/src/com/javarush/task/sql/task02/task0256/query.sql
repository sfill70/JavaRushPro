-- Write your code here:
/*Напиши запрос, который из таблицы автомобилей (cars) выберет название (name),
  суммарную и среднюю стоимость (price).*/




SELECT name, sum(price), avg(price)
FROM cars
GROUP BY name;
