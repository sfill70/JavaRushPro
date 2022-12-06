-- Write your code here:
/*В данной задаче тебе потребуется: 1. Выбрать все колонки из таблицы film_directors.
  2. Используя операторы WHERE, LIKE и CONCAT, добавить условие,
  что колонка full_name должна включать в себя результат подзапроса.
  3. В подзапросе следует выбрать две колонки, first_name и last_name (таблицы film_directors),
  разделив их пробелом и ограничив результат до одного.*/



SELECT *
FROM film_directors
WHERE full_name LIKE (SELECT CONCAT(first_name, ' ', last_name)
                      FROM film_directors LIMIT 1);
