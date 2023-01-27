-- Write your code here:
/*Представим, что у нас есть две таблицы:
- таблица author с колонками id, first_name, last_name, full_name;
- таблица book с колонками id, title, publication_year, isbn.
У каждого автора может быть несколько книг, а у каждой книги несколько авторов.
Тебе нужно создать таблицу author_book в которой будет храниться информация о связи авторов и книг.

Напиши SQL скрипт, который выполнит:
1. Создание таблицы с названием author_book.
2. Добавление колонки author_id с типом INT, значения в ней не могут быть null.
3. Добавление колонки book_id с типом INT, значения в ней тоже не могут быть null.*/

CREATE TABLE `author_book`
(
    `author_id` INT not null,
    `book_id`   INT not null
);