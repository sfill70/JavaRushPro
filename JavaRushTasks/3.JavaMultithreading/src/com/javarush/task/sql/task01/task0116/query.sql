-- Write your code here:
-- Выбрать содержимое всех колонок (используй *) из таблицы employee, у которых
-- значение поля salary строго меньше 5000 И значение поля salary строго больше 2000.

select * from employee where salary < 5000 and salary > 2000;
