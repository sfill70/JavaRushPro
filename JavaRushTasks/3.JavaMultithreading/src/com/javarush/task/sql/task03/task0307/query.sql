-- Write your code here:

-- Требуется найти колонки id и name из таблицы gyms, и колонку id из таблицы customers,
-- но при этом заменив название таблицы gyms на 'gym', а название таблицы customers на 'cust'.
-- Также, нам не нужны все id из таблицы cust, а только те, которые меньше 50. Используй AS и WHERE.



SELECT gym.id, gym.name, cust.id
FROM gyms AS gym, customers AS cust
WHERE cust.id < 50;
