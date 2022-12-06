-- Write your code here:
-- Напиши запрос, который из таблицы employee выберет имена (name) и позиции (position)
-- сотрудников через дефис ('-'). Результат - одна колонка.


SELECT CONCAT(name ,'-', position)
FROM employee;