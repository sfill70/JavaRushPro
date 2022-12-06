-- Write your code here:
/*Напиши запрос, который согласно данных из поля number_of_season таблицы months вернет такую информацию:
  - 'winter', если значение number_of_season равно 1 - 'spring', если значение number_of_season равно 2
  - 'summer', если значение number_of_season равно 3 - 'autumn', если значение number_of_season равно 4
  - 'unknown',
  при любом другом значении number_of_season
  Используй CASE вида CASE case_value WHEN value1 THEN result1 ... FROM table*/


SELECT
    CASE number_of_season
        WHEN 1 THEN 'winter'
        WHEN 2 THEN 'spring'
        WHEN 3 THEN 'summer'
        WHEN 4 THEN 'autumn'
        ELSE 'unknown'
        END
FROM months;