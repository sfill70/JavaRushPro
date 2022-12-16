-- Write your code here:
# Напиши запрос, который добавит в таблицу employee колонку с зарплатой salary с типом INT
# и департаментом department с типом VARCHAR(20).

ALTER TABLE employee
    ADD COLUMN salary INT,
    ADD COLUMN department VARCHAR(20);
