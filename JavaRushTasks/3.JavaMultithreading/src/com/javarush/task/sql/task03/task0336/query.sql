-- Write your code here:
/*1. Выбрать колонку year_born из таблицы authors, .
  2. Используя оператор WHERE, добавить условие, что year_born таблицы authors должно
  быть меньше или равно date_released из таблицы books.*/



SELECT year_born FROM authors
WHERE year_born <= (SELECT MAX(date_released) FROM books);
