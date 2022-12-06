-- Write your code here:Напиши запрос, к
-- оторый из таблицы cars выберет года выпуска (prod_year)
-- с указанием количества машин выпущенных в определенный год.

SELECT prod_year, COUNT(*)
FROM cars GROUP BY prod_year;
