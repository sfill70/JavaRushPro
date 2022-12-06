-- Write your code here:
-- Выбрать содержимое колонок department, salary, name (в указанном порядке)
-- из таблицы employee, у которых значение поля salary строго меньше 1000 ИЛИ
-- значение поля salary больше либо равно 5000. Используй OR.


select department, salary, name from employee where salary < 1000 or salary >= 5000;