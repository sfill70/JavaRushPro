-- Write your code here:
# Напиши запрос, который изменит в таблице employee тип колонки с зарплатой (salary) на FLOAT.

ALTER TABLE employee
    MODIFY COLUMN salary FLOAT;
