-- Write your code here:
-- Напиши запрос, который из таблицы employee выберет имена (name) сотрудников:
-- первая колонка - просто имя, вторая - имя преобразованное в base64.


SELECT name, TO_BASE64(name)
FROM employee;