-- Write your code here:
# Таблицы book связана с таблицей author через колонку author_id, которая содержит id авторов.
# Получи всех авторов, у которых в таблице book больше одной книги.
# Результат должен содержать две колонки: full_name автора и колонку books содержащую
# количество книг автора.


select author.full_name, count(*) as books
from book
         left join author on author.id = book.author_id
group by author_id
having books > 1;
