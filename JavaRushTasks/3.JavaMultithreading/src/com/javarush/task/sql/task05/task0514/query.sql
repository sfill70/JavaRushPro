-- Write your code here:
# Получи из таблицы part колонку name. Отфильтруй данные:
# нужны только те значения которые содержат строку 'Special'.


select name
from part
where name like '%Special%';