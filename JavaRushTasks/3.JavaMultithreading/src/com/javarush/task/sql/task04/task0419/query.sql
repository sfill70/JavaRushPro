-- Write your code here:
-- Напиши запрос, который вернет год, месяц, день и день месяца текущей даты.


SELECT YEAR(now()), MONTH(now()), DAY(now()), DAYOFMONTH(now());