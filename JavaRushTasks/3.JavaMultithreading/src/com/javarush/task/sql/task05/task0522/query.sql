-- Write your code here:
# Получи из таблицы part колонки name и weight. Значения колонки weight округли вверх.
# Колонку с округленными значениями назови ceil_weight.


select name, ceil(weight) as ceil_weight
from part;