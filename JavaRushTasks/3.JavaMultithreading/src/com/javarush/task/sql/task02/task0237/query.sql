-- Write your code here:
/*Напиши запрос, который согласно данных из таблицы cars выберет поля name и prod_year.
  В итоговой выборке информация должна быть сгрупирована по колонкам name, prod_year и price.*/

SELECT name, prod_year, count(*)
FROM cars
GROUP BY name, prod_year, price;
