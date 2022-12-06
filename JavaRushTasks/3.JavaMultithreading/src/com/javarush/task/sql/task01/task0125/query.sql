-- Write your code here:
-- Выбрать колонки brand, model, booked_quantity (в указанном порядке) из таблицы car,
-- у которых значение поля model не содержит комбинации букв ea (буквы - латиница, строчные)
-- Используй оператор NOT LIKE

select brand, model, booked_quantity from car where model NOT LIKE '%ea%';
