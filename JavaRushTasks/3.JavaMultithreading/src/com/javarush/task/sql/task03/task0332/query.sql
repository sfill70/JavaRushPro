-- Write your code here:
/*В В этой задаче тебе потребуется:
  1. Выбрать колонку last_name из таблицы authors, переименовав её в author,
  и колонки genre и date_released из таблицы books, переименовав genre в book_genre.
  2. Объединить таблицы authors и books оператором RIGHT JOIN, переименовав их в аuth и book,
  соответственно. 3. Используя оператор ON, добавить условие,
  что колонка author_id таблицы authors равнa колонке author_id таблицы books.
  4. Используя оператор WHERE, добавить условие,
  что date_released таблицы books должно быть меньше 1900. 5. Используя оператор GROUP BY,
  сгруппируй результат по колонкам genre и date_released таблицы books.
  Используй операторы RIGHT JOIN, AS, ON, WHERE и GROUP BY.*/



/*SELECT аuth.last_name AS author, book.genre AS book_genre
FROM authors AS аuth
         RIGHT JOIN books AS book
                    ON аuth.author_id = bookb.author_id
WHERE book.date_released < 1900
GROUP BY book.genre, book.date_released;*/


SELECT auth.last_name AS author, book.genre AS book_genre, book.date_released
FROM authors AS auth
         RIGHT JOIN books AS book ON auth.author_id = book.author_id
WHERE book.date_released < 1900
GROUP BY book.genre, book.date_released;
