-- Write your code here:
-- Требуется найти колонку location из таблицы gyms, и колонки name,
-- email и telephone из таблицы customers, но при этом заменив название таблицы gyms на 'g',
-- а название таблицы customers на 'person'. Также, нам нужен person только с именем 'Hulk'.
-- Используй AS и WHERE.




SELECT g.location, person.name, person.email, person.telephone
FROM gyms AS g, customers AS person
WHERE person.name = 'Hulk';
