-- Write your code here:
# Получи из таблицы lego_set колонки name, released, inventory.
# Отсортируй данные по годам, сначала более новые.
# Внутри одного года отсортируй по inventory по убыванию.

select name, released, inventory
from lego_set
order by released DESC , inventory DESC ;
