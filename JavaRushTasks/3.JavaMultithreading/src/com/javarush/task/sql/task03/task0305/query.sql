-- Write your code here:
-- Требуется найти колонки id и name из таблицы gyms, и колонки name и email из таблицы customers,
-- но при этом заменив название таблицы gyms на 'g', а название таблицы customers на 'c'.
-- Используй AS для временной замены названий.




select g.id, g.name, c.name, c.email
from gyms AS g, customers AS c;
