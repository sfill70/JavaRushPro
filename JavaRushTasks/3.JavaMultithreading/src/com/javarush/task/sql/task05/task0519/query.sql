-- Write your code here:
# Получи из таблицы lego_set количество наборов каждого года.
# Колонке с количеством задай имя total. Отфильтруй наборы по колонке number:
# учитывай только наборы с number меньше 10000. Отсортируй результат по количеству наборов по убыванию.

select released, count(*) as total
from lego_set
where number < 10000
group by released
order by total DESC ;