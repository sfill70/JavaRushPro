-- Write your code here:
-- Выбрать все колонки (используй *) из таблицы employee, у кого значение поля department dev или qa


select * from employee where department = 'dev' or department = 'qa';
