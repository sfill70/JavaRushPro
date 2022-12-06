-- Write your code here:
-- Напиши запрос, который из таблицы employee выберет имена (name) сотрудников:
-- первая колонка - просто имя, вторая - имя в нижнем регистре и третья - имя в верхнем регистре.



SELECT name, LOWER(name),UPPER(name)
FROM employee;
