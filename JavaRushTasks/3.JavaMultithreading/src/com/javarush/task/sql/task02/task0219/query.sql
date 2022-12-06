-- Write your code here:
/*Напиши запрос, который согласно данных из поля euro таблицы cars вернет такую информацию:
    - 'good', если значение euro равно NULL - 'bad', при любом другом значении eur/o*/


    SELECT
    CASE
        WHEN euro IS NOT NULL THEN 'bad'
        ELSE 'good'
        END
FROM cars
