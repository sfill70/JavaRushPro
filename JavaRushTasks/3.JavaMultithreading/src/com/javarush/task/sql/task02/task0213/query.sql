-- Write your code here:
/*Напиши запрос, который согласно данных из поля is_full_time таблицы students вернет такую информацию:
- 'true', если значение is_full_time равно 1
- 'false', если значение is_full_time равно 0

Используй CASE вида CASE case_value WHEN value1 THEN result1 ... FROM table
Значение поля is_full_time может быть отличным от 0 и 1. Этот кейс обрабатывать не нужно.*/

SELECT
    CASE is_full_time
        WHEN 0 THEN 'false'
        WHEN 1 THEN 'true'
        END
FROM students
