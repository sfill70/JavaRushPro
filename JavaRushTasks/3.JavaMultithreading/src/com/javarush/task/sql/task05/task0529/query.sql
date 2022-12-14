-- Write your code here:
# Таблицы book связана с таблицей author через колонку author_id,
# значения в которой являются id авторов. Таблицы book связана с таблицей publisher
# через колонку publisher_id, которая содержит id издателей.
# Для каждого автора получи количество издателей, издававших его книги.
# Результат должен содержать две колонки: - full_name автора;
# - колонку publishers с количеством издателей. Если в БД нет книг какого-то автора,
# то в колонке publishers должен быть 0.
# count(distinct p.name) - не дает повтров по имени издательства.


select a.full_name, count(distinct p.name) publishers
from author a
         left join book b on a.id = b.author_id
         left join publisher p on p.id = b.publisher_id
group by a.id;