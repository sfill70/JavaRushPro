-- Write your code here:
# Напиши запрос, который удалит в таблице cities колонку с населением (population).


ALTER TABLE cities
    DROP COLUMN population;