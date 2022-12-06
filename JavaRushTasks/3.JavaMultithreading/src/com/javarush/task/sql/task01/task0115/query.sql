-- Write your code here:
-- Выбрать содержимое колонок id, salary, department, name (в указанном порядке)
-- из таблицы employee, у которых значение поля salary строго меньше 5000 И значение поля
-- department равное dev.

select id, salary, department, name from employee where salary < 5000 and department = 'dev';
