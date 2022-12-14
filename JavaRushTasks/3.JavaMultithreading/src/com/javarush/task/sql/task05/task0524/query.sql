-- Write your code here:
# Таблицы book связана с таблицей author через колонку author_id, которая содержит id авторов.
# Получи все книги, у авторов которых last_name начинается на 'S'.
# Результат должен содержать две колонки: isbn и title.


select isbn, title
from book
         left join author on author.id = book.author_id
where author.last_name like 'S%';
