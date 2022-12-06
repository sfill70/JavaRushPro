-- Write your code here:

-- Напиши запрос, который из таблицы task выберет названия задач (title),
-- которые являются истекшими (поле exp_date) на дату '2022-10-01'.



SELECT title
FROM task WHERE exp_date < '2022-10-01' ;