-- Write your code here:
-- Выбрать колонки brand, model, quantity (в указанном порядке) из таблицы car.
-- Выбрать нужно только первых 115 записей. Нужно использовать: LIMIT


SELECT brand, model, quantity FROM car
                  LIMIT 115;