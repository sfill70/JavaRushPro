-- Write your code here:
# Удали из таблицы task записи с id в диапазоне от 5 до 10.

DELETE FROM task
WHERE id IN (5,6,7,8,9,10);
