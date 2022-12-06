-- Write your code here:
-- Напиши запрос, который вернет часы, минуты и секунды текущего времени.


SELECT HOUR(now()), MINUTE(now()), SECOND(now());