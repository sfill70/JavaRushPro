-- Write your code here:
-- Напиши запрос, который из таблицы employee выберет позиции (position) сотрудников,
-- но при этом, если в позиции встречается слово 'developer', то замени его на 'software developer'.


SELECT REPLACE(position, 'developer', 'software developer')
FROM employee;

