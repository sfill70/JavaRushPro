-- Write your code here:
-- Требуется выбрать колонки name и annual_revenue_billions из таблицы top_retailers,
-- но временно заменив обращение к колонке name на ret_name,
-- а к колонке annual_revenue_billions на ret_revenue.
-- Также следует выбрать колонку name из таблицы suppliers,
-- временно заменив name на sup_name.
-- Также следует временно заменить названия таблиц с top_retailers на ret,
-- и suppliers на supplier. Используй AS.


SELECT ret.name                    AS ret_name,
       ret.annual_revenue_billions AS ret_revenue,
       supplier.name               AS sup_name,
FROM top_retailers AS ret,
     suppliers AS supplier;

/*SELECT ret.name AS ret_name, ret.annual_revenue_billions AS ret_revenue, supplier.name AS sup_name
FROM top_retailers AS ret,
     suppliers AS supplier*/
