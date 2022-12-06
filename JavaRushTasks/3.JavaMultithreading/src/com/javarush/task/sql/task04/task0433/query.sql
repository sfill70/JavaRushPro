-- Write your code here:
-- Напиши запрос, который из таблицы event выберет год, месяц, день из поля date и
-- количество событий, которые относятся к данному году, месяцу и дню.
-- Выбрать данные для пользователя с id = 3 (user_id), событие - решение задачи
-- (поле type равно 'SOLVE_TASK') с успешным статусом (поле status равно 'OK').


SELECT YEAR(date), MONTH(date), DAY(date), count(*)
FROM event
WHERE user_id = 3
   AND type = 'SOLVE_TASK' AND status = 'OK'
GROUP BY SELECT YEAR(date), MONTH(date), DAY(date);