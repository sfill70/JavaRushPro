-- Write your code here:
-- Напиши запрос, который согласно значения поля age в таблице customers возвращает следующий
-- текст: - 'child', если возраст меньше либо равен 12 - 'adult', если возраст больше либо
-- равен 20 - 'teenager', если возраст больше 12 и меньше 20. Ограничь выборку 5 записями.
-- Используй запрос вида SELECT IF(<условие>, <если_истинно>, IF(...)) FROM <таблица> LIMIT ...


SELECT IF(age<=12, 'child', IF(age>=20, 'adult', 'teenager')) FROM customers LIMIT 5;