-- Write your code here:
-- Напиши запрос, который из таблицы event выберет день недели на основе даты (date)
-- и количество регистраций (поле type равно 'REGISTRATION').
-- Выбрать нужно только тот день, в котором зарегистрировались больше всего пользователей.
-- Используй DAYNAME().


SELECT DAYNAME(date), COUNT(*)
FROM event
WHERE type = 'REGISTRATION'
GROUP BY DAYNAME(date)
ORDER BY COUNT(*) DESC LIMIT 1;
