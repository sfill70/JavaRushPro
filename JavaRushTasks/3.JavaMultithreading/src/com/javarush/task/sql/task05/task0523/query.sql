-- Write your code here:
# Получи из таблицы lego_set колонки number и inventory.
# Значения колонки inventory увеличь на 1 процент, и то, что получилось, округли к ближайшему целому.
# Колонку с округленными значениями назови with_spare_parts.



select number, round(inventory + 0.01 * inventory) as with_spare_parts
from lego_set;
