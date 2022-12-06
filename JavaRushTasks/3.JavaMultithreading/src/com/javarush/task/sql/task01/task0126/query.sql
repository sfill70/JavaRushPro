-- Write your code here:
-- Выбрать колонки brand, model, quantity, booked_quantity (в указанном порядке) из таблицы car,
-- у которых значение поля model европейское (renault, opel, seat, skoda)
-- ИЛИ разница между quantity и booked_quantity МЕНЬШЕ 10 Нужно использовать: IN, OR


select brand, model, quantity, booked_quantity from car where
        model IN ('renault', 'opel', 'seat', 'skoda') OR (quantity - booked_quantity) < 10;
