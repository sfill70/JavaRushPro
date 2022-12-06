-- Write your code here:
/*Напиши запрос, который согласно данных из поля experience таблицы developers вернет такую информацию:
  - 'junior', если значение experience менее 1 - 'middle', если значение experience менее 3 - 'senior',
  если значение experience менее 5 Используй CASE вида CASE WHEN condition1 THEN result1 ... FROM table*/



SELECT
    CASE
        WHEN experience < 1 THEN 'junior'
        WHEN experience < 3 THEN 'middle'
        WHEN experience < 5 THEN 'senior'
        END
FROM developers

