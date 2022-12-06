-- Write your code here:
-- Первым делом требуется выбрать колонки location из таблиц gyms и customers,
-- но заменив при этом название таблицы gyms на 'gym', а название таблицы customers на 'person'.
-- Также, нам нужно исключить из результата location 'London' таблицы person.
-- И в конце концов следует сгрупировать результат по колонкам location таблиц gym и person.
-- Для решения тебе понадобятся AS, WHERE и GROUP BY.



SELECT gym.location, person.location
FROM gyms AS gym, customers AS person
WHERE person.location != 'London'
GROUP BY gym.location, person.location;
