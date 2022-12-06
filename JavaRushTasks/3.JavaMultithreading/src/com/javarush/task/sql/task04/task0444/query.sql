-- Write your code here:
-- Напиши запрос, который из таблицы cities выберет 3 города (city),
-- у которых самое маленькое количество букв в названии города.
-- После названия добавить через дефис количество букв в названии.



SELECT CONCAT(city, '-', CHAR_LENGTH(city)) FROM cities ORDER BY CHAR_LENGTH(city) ASC LIMIT 3;

/*SELECT CONCAT(city, '-', CHAR_LENGTH(city))
FROM cities
ORDER BY CHAR_LENGTH(city) ASC LIMIT 3;*/