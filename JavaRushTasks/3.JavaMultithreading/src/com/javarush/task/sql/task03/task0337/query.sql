-- Write your code here:

-- Выбрать все колонки из таблицы authors.
-- 2. Добавить условие, что колонка id таблицы authors не должна включать в себя
-- автора с author_id 7 (из таблицы books) и с title 'War and Peace'.


SELECT * FROM authors
WHERE id NOT IN (SELECT author_id FROM books WHERE author_id = 7 OR title='War and Peace');

/*или
SELECT * FROM authors
WHERE id != (SELECT author_id FROM books WHERE author_id = 7 OR title='War and Peace');*/