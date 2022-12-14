-- Write your code here:
# Получи из таблицы object (схема space) все объекты открытые с начала 2010 до конца 2020 года.
# Результат должен содержать все колонки таблицы.



select *
from object
where discovery_date between '2010-01-01' and '2020-12-31';