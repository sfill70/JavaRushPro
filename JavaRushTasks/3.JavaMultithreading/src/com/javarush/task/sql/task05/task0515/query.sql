-- Write your code here:
# Получи из таблицы part колонку name. Отфильтруй данные: нужны только те значения которые
# содержат строку 'Slope' и не содержат строку '45°'.


select name
from part
where name like '%Slope%'
  and name not like '%45°%';