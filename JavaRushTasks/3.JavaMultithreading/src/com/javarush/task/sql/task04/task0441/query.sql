-- Write your code here:

-- Напиши запрос, который из таблицы employee выберет имена (name_b64) сотрудников в base64
-- в первую колонку и имена, преобразованные из base64, во вторую.



SELECT name_b64, FROM_BASE64(name_b64)
FROM employee;