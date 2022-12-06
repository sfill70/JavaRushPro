-- Write your code here:
/*В этой задаче тебе потребуется:
  1. Выбрать колонки sex и country из таблицы authors, переименовав их в author_sex и author_country,
  соответственно. Также, выбрать колонку copies_sold_millions из таблицы books,
  переименовав её в books_sold. 2. Объединить таблицы authors и books оператором JOIN,
  переименовав их в a и b, соответственно. 3. Используя оператор ON, добавить условие,
  что колонка author_id таблицы authors равнa колонке author_id таблицы books.
  4. Используя оператор WHERE, добавить условие, что copies_sold_millions
  таблицы books должно быть больше 10. 5. Используя оператор GROUP BY,
  сгруппируй результат по колонкам sex и country таблицы authors и
  колонке copies_sold_millions таблицы books. 6. Используя операторы ORDER BY и DESC,
  отсортируй результат по убыванию, по колонке copies_sold_millions таблицы books.
  Используй операторы JOIN, AS, ON, WHERE, GROUP BY, ORDER BY и DESC.*/


/*SELECT a.sex AS author_sex, a.country AS author_country,
       b.copies_sold_millions AS books_sold
FROM authors AS a
         JOIN books AS b
             ON a.author_id = b.author_id
WHERE b.copies_sold_millions > 10
GROUP BY author_sex, author_country, books_sold
ORDER BY  books_sold ;
ORDER BY  books_sold DESC;*/

SELECT a.sex AS author_sex, a.country AS author_country, b.copies_sold_millions AS books_sold
FROM authors AS a
         JOIN books AS b ON a.author_id = b.author_id
WHERE b.copies_sold_millions > 10
GROUP BY a.sex, a.country, b.copies_sold_millions
ORDER BY b.copies_sold_millions DESC
