-- Write your code here:
/*Напиши запрос, который из таблицы cars выберет года выпуска (prod_year)
  с указанием количества машин выпущенных в определенный год. Колонка с
  количеством в результате должна иметь название car_count.*/



SELECT prod_year, count(*) AS car_count
FROM cars
GROUP BY prod_year;
