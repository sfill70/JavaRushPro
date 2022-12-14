-- Write your code here:
# Таблицы book связана с таблицей author через колонку author_id,
# значения в которой являются id авторов. Таблицы book связана
# с таблицей publisher через колонку publisher_id, которая содержит id издателей.
# Получи все книги из таблицы book. Результат должен содержать пять колонок:
# - год публикаци, isbn и title книги; - колонку называющуюся author содержащую
# full_name автора книги; - колонку называющуюся publisher содержащую name издателя книги.

select book.title, book.publication_year, book.isbn, author.full_name as author, publisher.name as publisher
from book
         left join author on author.id = book.author_id
         left join publisher on publisher.id = book.publisher_id;