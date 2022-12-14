-- Write your code here:
# Получи из таблицы object (схема space) данные про дату открытия.
# Результат должен содержать четыре колонки: - name; - колонку d_year содержащую год открытия объекта;
# - колонку d_month содержащую название месяца открытия объекта;
# - колонку d_day содержащую название дня недели открытия объекта.

select name, year(discovery_date) d_year, monthname(discovery_date) d_month, dayname(discovery_date) d_day
from object;