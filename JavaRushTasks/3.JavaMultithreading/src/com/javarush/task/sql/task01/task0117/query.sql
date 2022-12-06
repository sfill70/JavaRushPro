-- Write your code here:
/*Выбрать содержимое колонок department, salary, name (в указанном порядке) из таблицы employee,
    у которых значение поля salary строго больше 2200 И значение поля department НЕ равное qa.
    Используй AND NOT.*/

select department, salary, name from employee where salary > 2200 AND NOT department = 'qa';