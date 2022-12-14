-- Write your code here:
# Таблицы book связана с таблицей author через колонку author_id, значения
# в которой являются id авторов. Получи названия всех книг автора 'Edgar Allan Poe'.
# Результат должен содержать одну колонку title. Значения в колонке не должны повторяться.

select distinct book.title
from book
         left join author on author.id = book.author_id
where author.full_name = 'Edgar Allan Poe';
