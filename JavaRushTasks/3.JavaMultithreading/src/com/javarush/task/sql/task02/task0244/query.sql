-- Write your code here:
/*Напиши запрос, который из таблицы cars на основе даты производства (prod_date) выберет год,
  месяц (номер) производства и количество автомобилей, произведенных в этот год и месяц.
  Год и месяц нужно выбрать в разные колонки. Колонкам год и месяц присвой алиасы prod_year и
  prod_month соответственно. Группировку делай по алиасам. В выборку должны попасть только
  автомобили с названием (name) 'Black Car' и стоимостью (price) больше 99000.*/


SELECT YEAR (prod_date) AS prod_year, MONTH (prod_date) AS prod_month, count (*)
FROM cars
WHERE name = 'Black Car' AND price > 99000
GROUP BY prod_year, prod_month;
