-- Write your code here:
# Получи из таблицы lego_set количество наборов каждого года.
# Должно получиться две колонки: released и count(*).


SELECT released, count(*)
FROM lego_set
GROUP BY released;