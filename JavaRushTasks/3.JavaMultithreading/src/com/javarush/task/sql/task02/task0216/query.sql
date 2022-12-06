-- Write your code here:
/*Напиши запрос, который согласно данных из поля position таблицы employee вернет такую информацию:
- 'yes', если значение position равно 'backend developer'
- 'yes', если значение position равно 'frontend developer'
- 'no', при любом другом значении position

Ограничь выборку сотрудниками, у которых department = 'cool devs'.
Используй CASE вида CASE WHEN condition1 THEN result1 WHEN condition2 ... FROM table*/

/*SELECT
    CASE position
        WHEN 'backend developer' THEN 'yes'
        WHEN 'frontend developer' THEN 'yes'
        ELSE 'no'
        END
FROM employee WHERE department = 'cool devs';
*/
SELECT
    CASE
        WHEN position = 'backend developer' THEN 'yes'
        WHEN position = 'frontend developer' THEN 'yes'
        ELSE 'no'
        END
FROM employee WHERE department = 'cool devs'
