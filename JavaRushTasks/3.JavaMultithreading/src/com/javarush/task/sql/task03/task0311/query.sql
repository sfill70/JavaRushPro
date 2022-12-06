-- Write your code here:
-- Требуется выбрать колонки name и hq_location из таблицы top_retailers,
-- но временно заменив обращение к колонке top_retailers.name на retailer,
-- а к колонке top_retailers.hq_location на retailer_hq.
-- Также следует выбрать колонку country из таблицы suppliers,
-- временно заменив название на supplier_country. Используй AS.


SELECT top_retailers.name AS retailer, top_retailers.hq_location AS retailer_hq, suppliers.country AS supplier_country
FROM top_retailers,
     suppliers;
