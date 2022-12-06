-- Write your code here:
-- Выбрать все колонки (используй *) из таблицы car, у которых значение поля model
-- не содержит букву a (латиница, строчная) И разница между quantity и booked_quantity
-- МЕЖДУ 5 и 500 включительно. Нужно использовать: NOT LIKE, BETWEEN

select * from car where model NOT LIKE '%a%' AND (quantity - booked_quantity) BETWEEN 5 AND 500;
