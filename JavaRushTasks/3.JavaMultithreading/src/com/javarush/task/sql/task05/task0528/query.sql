-- Write your code here:
# Таблицы book связана с таблицей author через колонку author_id, значения в которой являются id авторов.
# Получи названия всех издателей которые издавали книги автора 'Mark Twain'.
# Результат должен содержать одну колонку name. Значения в колонке не должны повторяться.


select distinct publisher.name
from publisher
         left join book on publisher.id = book.publisher_id
         left join author on author.id = book.author_id
where author.full_name = 'Mark Twain';