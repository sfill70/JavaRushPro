-- Write your code here:
-- Напиши запрос, который из таблицы event выберет месяц (название) из поля date и
-- количество событий, которые произошли в этом месяце и были неуспешными
-- (поле status равно 'ERROR' или 'FAILED'). В выборку должны попасть только
-- данные по самому неуспешному месяцу.

SELECT MONTHNAME(date), COUNT(*)
FROM event
WHERE status = 'ERROR'
   OR status = 'FAILED'
GROUP BY MONTHNAME(date)
ORDER BY COUNT(*) DESC LIMIT 1;
