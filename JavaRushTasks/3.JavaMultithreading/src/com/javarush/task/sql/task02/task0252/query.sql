-- Write your code here:
/*Напиши запрос, который из таблицы cars выберет название (name) и сумму стоимостей (name).*/



SELECT name, sum(price)
FROM cars
GROUP BY name;

