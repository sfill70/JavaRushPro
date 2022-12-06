-- Write your code here:
/*В данной задаче тебе потребуется: 1. Используя оператор WITH создать временную таблицу tempTable с
  колонкой averageDOB. 2. Используя оператор AS, добавить подзапрос, в котором требуется
  найти среднее значение колонки year_born таблицы film_directors.
  3. Выбрать колонки id, full_name и year_born из таблицы film_directors и tempTable.
  4. Добавить условие, что колонка year_born таблицы film_directors должна быть меньше
  колонки averageDOB таблицы tempTable. */


WITH tempTable(averageDOB)
    AS ( SELECT avg(year_born)
         FROM film_directors)
SELECT film_directors.id, film_directors.full_name, film_directors.year_born
FROM film_directors, tempTable
WHERE film_directors.year_born < tempTable.averageDOB;

/*WITH tempTable(averageDOB) AS
         (SELECT AVG(year_born)
          FROM film_directors)
SELECT id, full_name, year_born
FROM film_directors, tempTable
WHERE film_directors.year_born < tempTable.averageDOB;*/