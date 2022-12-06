-- Write your code here:
/*В данной задаче тебе потребуется: 1. Выбрать все колонки из таблицы films.
  2. Используя операторы WHERE и LIKE, добавить условие, что колонка title должна включать
  в себя результат подзапроса. 3. В подзапросе следует выбрать колонку title таблицы films,
  затем дополнительно указать, что колонка title должна содержать название фильма,
  который начинается с 'The' и заканчивается на букву 'r'.
  4. Также важно ограничить результат подзапроса до одного.*/



SELECT *
FROM films
WHERE title LIKE (SELECT title
                  FROM films
                  WHERE title LIKE 'The%r' LIMIT 1);


/*SELECT *
FROM films
WHERE title LIKE (SELECT title FROM films WHERE title LIKE 'The%r' LIMIT 1);*/

