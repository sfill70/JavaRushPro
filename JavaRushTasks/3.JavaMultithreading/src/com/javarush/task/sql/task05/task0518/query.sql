-- Write your code here:
# Получи из таблицы lego_set количество наборов каждого года.
# Колонке с количеством задай имя total. Должно получиться две колонки: released и total.
# Отсортируй результат по количеству наборов по убыванию.


SELECT released, count(*) AS total
FROM lego_set
GROUP BY released ORDER BY total DESC ;