-- Write your code here:
/*1. Выбрать все колонки из таблицы authors.
  2. Используя операторы WHERE и IN, добавить условие, что колонка id должна включать в себя
  результат подзапроса. 3. В подзапросе следует выбрать колонку author_id таблицы books,
  затем дополнительно указать, что колонка genre должна содержать только 'fantasy'.*/


SELECT * FROM authors
WHERE id IN (SELECT author_id
                          FROM books WHERE genre = 'fantasy');
