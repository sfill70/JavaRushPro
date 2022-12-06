-- Write your code here:
/*Напиши запрос, который из таблицы cars выберет информацию о том,
  сколько каких названий (name) автомобилей есть в наличии. Колонка с именем
  в результате должна иметь название car_name, а колонка с количеством - car_count.*/



SELECT name AS car_name, count(*) AS car_count
FROM cars
GROUP BY name;
