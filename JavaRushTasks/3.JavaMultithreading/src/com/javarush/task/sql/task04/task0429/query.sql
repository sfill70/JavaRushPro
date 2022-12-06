-- Write your code here:
-- Напиши запрос, который из таблицы event выберет все поля событий,
-- которые произошли за последние 2 недели. Дата и время событий хранится в поле date_time.
-- Используй BETWEEN, DATE_SUB() и CURDATE().


SELECT *
FROM event
WHERE date_time BETWEEN DATE_SUB(CURDATE(), INTERVAL 2 WEEK) AND CURDATE();