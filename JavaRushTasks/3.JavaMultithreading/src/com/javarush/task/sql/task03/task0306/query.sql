-- Write your code here:
-- Требуется найти колонку location из таблицы gyms, и колонки name и sex из таблицы customers,
-- но при этом заменив название таблицы gyms на 'gym', а название таблицы customers на 'visitor'.
-- Используй AS для временной замены названий.


select gym.location, visitor.name, visitor.sex
from gyms AS gym,
     customers AS visitor;
