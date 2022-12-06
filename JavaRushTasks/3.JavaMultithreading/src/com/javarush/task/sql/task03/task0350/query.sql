-- Write your code here:
/*В данной задаче тебе потребуется: 1. Используя оператор WITH создать временную таблицу
  tempTable с колонкой averageGrossed. 2. Используя оператор AS, добавить подзапрос,
  в котором требуется найти среднее значение колонки grossed таблицы films.
  3. Создать вторую временную таблицу tempTable2, и используя оператор AS,
  добавить второй подзапрос, в котором требуется найти среднее значение колонки year_released
  таблицы films. 4. Выбрать колонки title, genre, year_released и grossed из таблиц films,
  tempTable и tempTable2. 5. Добавить условие, что колонка grossed таблицы films должна быть
  больше колонки averageGrossed таблицы tempTable, а также, колонка year_released
  таблицы films должна быть больше колонки averageYearReleased таблицы tempTable2.
  6. Сгруппировать результат по колонке year_released таблицы films.*/



WITH tempTable(averageGrossed)
         AS (SELECT avg(grossed)
             FROM films),
     tempTable2(averageYearReleased)
         AS (SELECT avg(year_released)
             FROM films)
SELECT title, genre, year_released, grossed
FROM films,
     tempTable,
     tempTable2
WHERE films.grossed > tempTable.averageGrossed
  AND films.year_released > tempTable2.averageYearReleased
GROUP BY films.year_released;


/*WITH tempTable(averageGrossed) AS
         (SELECT AVG(grossed)
          FROM films),
     tempTable2(averageYearReleased) AS
         (SELECT AVG(year_released)
          FROM films)
SELECT title, genre, year_released, grossed
FROM films,
     tempTable,
     tempTable2
WHERE films.grossed > tempTable.averageGrossed
  AND films.year_released > tempTable2.averageYearReleased
GROUP BY films.year_released;
*/