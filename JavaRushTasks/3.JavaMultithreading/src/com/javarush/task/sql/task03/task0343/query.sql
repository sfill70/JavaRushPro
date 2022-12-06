-- Write your code here:
/*В данной задаче тебе потребуется: 1. Выбрать колонку full_name из таблицы film_directors.
  2. Используя оператор LEFT JOIN, добавить подзапрос, в котором требуется выбрать колонку
  title таблицы films, с фильтром WHERE, который должен находить только комедии из колонки genre.
  3. Таблица films должна быть переименована в f. 4. Таблицы должны быть связаны по
  полям id (таблицы film_directors) и director_id (таблицы films).*/


SELECT full_name
FROM film_directors
         LEFT JOIN (SELECT title, director_id FROM films WHERE films.genre = 'comedy') AS f
                   ON film_directors.id = f.director_id;


