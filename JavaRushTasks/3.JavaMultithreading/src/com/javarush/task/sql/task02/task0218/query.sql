-- Write your code here:

-- Напиши запрос, который согласно данных из поля euro таблицы cars вернет такую информацию:
-- - 'best', если значение euro больше 5 - 'good', если значение euro равно 5 - 'bad',
-- при любом другом значении euro Если значение euro равно NULL, то перед сравнением заменить его на 6.


SELECT
    CASE
        WHEN IFNULL(euro, 6) > 5 THEN 'best'
        WHEN euro = 5 THEN 'good'
        ELSE 'bad'
        END
FROM cars

