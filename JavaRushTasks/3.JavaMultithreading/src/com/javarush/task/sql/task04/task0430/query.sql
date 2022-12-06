-- Write your code here:
-- Напиши запрос, который из таблицы event выберет год, месяц, день из поля date и количество событий,
-- которые относятся к данному году, месяцу и дню. Выбрать данные только по тем дням, где больше 5 событий.



SELECT YEAR(date), MONTH(date), DAY(date), count(*)
FROM event
GROUP BY YEAR(date), MONTH(date), DAY(date) HAVING COUNT(*) > 5;