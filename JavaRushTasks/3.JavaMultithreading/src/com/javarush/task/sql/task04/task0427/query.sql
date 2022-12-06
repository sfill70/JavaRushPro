-- Write your code here:
-- Напиши запрос, который из таблицы event выберет все поля событий, которые произошли за последние
-- 20 дней. Дата и время событий хранится в поле date_time. Используй DATEDIFF() и CURDATE().

SELECT * FROM event WHERE DATEDIFF(CURDATE(), date_time) < 20;
