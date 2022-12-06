-- Write your code here:
/*В этой задаче тебе потребуется: 1. Выбрать колонку last_name из таблицы authors,
  переименовав её в author, и колонки title и copies_sold_millions из таблицы books,
  переименовав их в book_title и books_sold, соответственно.
  2. Объединить таблицы authors и books оператором RIGHT JOIN, переименовав их в а и b,
  соответственно. 3. Используя оператор ON, добавить условие,
  что колонка author_id таблицы authors равнa колонке author_id таблицы books.
  4. Используя оператор WHERE, добавить условие, что copies_sold_millions таблицы books должно
  быть больше 50. Используй операторы RIGHT JOIN, AS, ON и WHERE.
*/


SELECT a.last_name AS author, b.title AS books_title, b.copies_sold_millions AS books_sold,
FROM authors AS a
         RIGHT JOIN books AS b
                    ON a.author_id = b.author_id
WHERE b.copies_sold_millions > 50;
