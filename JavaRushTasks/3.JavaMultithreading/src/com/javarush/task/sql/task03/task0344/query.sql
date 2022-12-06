-- Write your code here:
/*В данной задаче тебе потребуется: 1. Выбрать колонку title из таблицы films.
  2. Используя оператор LEFT JOIN, добавить подзапрос, в котором требуется выбрать
  колонку last_name таблицы film_directors, с фильтром WHERE, который должен находить
  только 'Spielberg'. 3. Таблица film_directors должна быть переименована в director.
  4. Таблицы должны быть связаны по полям id (таблицы film_directors) и director_id (таблицы films). */



SELECT title
FROM films
         LEFT JOIN (SELECT last_name, id FROM film_directors WHERE film_directors.last_name = 'Spielberg') AS director
                   ON films.director_id = director.id;


/*SELECT title
FROM films
         LEFT JOIN (SELECT last_name, id FROM film_directors WHERE film_directors.last_name = 'Spielberg') AS director
                   ON films.director_id = director.id;*/