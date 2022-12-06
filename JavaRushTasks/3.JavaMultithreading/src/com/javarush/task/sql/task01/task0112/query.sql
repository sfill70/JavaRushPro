-- Write your code here:
-- Выбрать содержимое колонок id, salary, department (в указанном порядке)
-- из таблицы employee, у которых значение поля salary меньше либо равно 1594.

select id, salary, department from employee where salary <= 1594;
