-- Write your code here:
# В данной задаче тебе потребуется: 1. Используя оператор VIEW, создать виртуальную таблицу с названием all_users,
# которая будет основана на всех колонках таблицы test.

CREATE VIEW all_users AS
SELECT * FROM test;
