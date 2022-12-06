-- Write your code here:
-- Напиши запрос, который вернет текущую дату (без времени),
-- а также дату и время через 3 дня и 3 дня назад. Используй функции добавления
-- и вычитания для дат и INTERVAL.


SELECT DATE (now()), ADDDATE(now(), INTERVAL 3 DAY), SUBDATE(now(), INTERVAL 3 DAY);