-- Write your code here:

-- Выбрать колонки brand, model, booked_quantity (в указанном порядке) из таблицы car,
-- у которых значение поля model начинается на букву k. Используй оператор LIKE


select brand, model, booked_quantity from car where model LIKE 'k%';
