-- Write your code here:
/*В данной задаче тебе потребуется: 1. Выбрать колонку last_name из таблицы film_directors.
  2. Используя оператор LEFT JOIN, добавить подзапрос, в котором требуется выбрать колонку grossed
  таблицы films, с фильтром WHERE, который должен находить фильмы, которые принесли более 100.
  3. Таблица films должна быть переименована в film.
  4. Таблицы должны быть связаны по полям id (таблицы film_directors) и director_id (таблицы films).
  5. И в конце концов, требуется добавить фильтр WHERE который будет находить режиссёров только из UK. */



SELECT last_name
FROM film_directors
         LEFT JOIN (SELECT grossed, director_id FROM films WHERE films.grossed > 100) AS film
                   ON film.director_id = film_directors.id
WHERE film_directors.country = 'UK';