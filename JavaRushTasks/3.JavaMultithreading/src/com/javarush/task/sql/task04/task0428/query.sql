-- Write your code here:
-- Напиши запрос, который из таблицы event выберет все поля событий,
-- которые произошли за текущий месяц. Дата и время событий хранится в поле date_time.
-- Используй MONTH() и CURDATE().


SELECT * FROM event WHERE MONTH(date_time) = MONTH(CURDATE());