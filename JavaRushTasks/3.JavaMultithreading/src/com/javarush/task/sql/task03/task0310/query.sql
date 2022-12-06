-- Write your code here:
-- Требуется выбрать колонки location из таблиц gyms и customers,
-- но заменив при этом их названия с location на city для таблицы gyms,
-- и с location на address для таблицы customers.



SELECT gyms.location AS cyty, customers.location AS address
FROM gyms, customers ;
