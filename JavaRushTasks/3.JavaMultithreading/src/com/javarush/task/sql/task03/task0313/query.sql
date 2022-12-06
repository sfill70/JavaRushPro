-- Write your code here:
-- Требуется выбрать колонку name из таблицы top_retailers,
-- но временно заменив обращение к колонке на ret_name.
-- Также следует выбрать колонки name и country из таблицы suppliers,
-- временно заменив name на sup_name, а country на sup_country.
-- Также следует временно заменить названия таблиц с top_retailers на retailers,
-- и suppliers на sup. Используй AS.

/*SELECT top_retailers.name AS ret_name,
       suppliers.name     AS sup_name
    suppliers.country AS sup_country
FROM top_retailers AS retailers,
     suppliers AS sup;*/

SELECT retailers.name AS ret_name,
       sup.name       AS sup_name,
       sup.country    AS sup_country
FROM top_retailers AS retailers,
     suppliers AS sup

