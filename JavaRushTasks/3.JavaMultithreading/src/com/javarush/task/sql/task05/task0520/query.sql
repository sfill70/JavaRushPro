-- Write your code here:
# Получи из таблицы lego_set все номера и имена в виде одной колонки с именем full_name,
# по принципу: если номер был 71761, а имя 'Zane’s Power Up Mech EVO',
# то в колонке full_name должно получиться: 71761, Zane’s Power Up Mech EVO т.е.
# номер и имя разделенные запятой и пробелом. Отсортируй результат по номеру по возрастанию.

select concat(number, ', ', name) as full_name
from lego_set
order by number;