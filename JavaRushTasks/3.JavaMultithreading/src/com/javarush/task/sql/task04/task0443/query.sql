-- Write your code here:
-- Напиши запрос, который из таблицы cities выберет 3 города (city),
-- у которых самое большое количество букв в названии города.



SELECT city
FROM cities
ORDER BY CHAR_LENGTH(city) DESC LIMIT 3;
