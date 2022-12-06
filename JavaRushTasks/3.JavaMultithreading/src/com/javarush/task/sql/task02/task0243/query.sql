-- Write your code here:
/*Напиши запрос, который из таблицы cars на основе даты производства (prod_date) выберет год,
  месяц (номер) производства и количество автомобилей, произведенных в этот год и месяц.
  Год и месяц нужно выбрать в разные колонки. Колонкам год и месяц присвой алиасы prod_year и
  prod_year соответственно. Группировку делай по алиасам.*/



SELECT YEAR (prod_date) AS prod_year, MONTH (prod_date) AS prod_month, count (*)
FROM cars
GROUP BY prod_year, prod_month;
