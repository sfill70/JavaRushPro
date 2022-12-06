-- Write your code here:
-- Выбрать все колонки (используй *) из таблицы car, у которых значение разницы количества (quantity)
-- и забронированного количества (booked_quantity) МЕЖДУ 10 и 100 включительно. Используй оператор BETWEEN

select * from car where quantity-booked_quantity BETWEEN 10 AND 100;
