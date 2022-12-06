-- Write your code here:
-- Выбрать все колонки (используй *) из таблицы car, у которых значение
--     поля brand ОДНО ИЗ: mazda, toyota, nissan. Используй оператор IN/


select * from car where brand IN ('mazda', 'toyota', 'nissan');
