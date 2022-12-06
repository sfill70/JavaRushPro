-- Write your code here:
/*1. Выбрать все колонки из таблицы authors.
  2. Используя операторы WHERE и NOT IN, добавить условие, что колонка id не должна включать
  в себя результат подзапроса. 3. В подзапросе следует выбрать колонку author_id таблицы books,
  затем дополнительно указать, что колонка author_id не должна содержать NULL,
  и колонка genre (также таблицы books) должна равняться 'novel'.*/




SELECT * FROM authors
WHERE id NOT IN (SELECT author_id
             FROM books WHERE author_id IS NOT NULL AND genre = 'novel');
