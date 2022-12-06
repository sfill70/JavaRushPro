-- Write your code here:
-- Выбрать все колонки (используй *) из таблицы employee,
-- у кого значение поля salary МЕЖДУ 1000 и 5000 включительно. Используй оператор BETWEEN

select * from employee where salary BETWEEN 1000 AND 5000;
