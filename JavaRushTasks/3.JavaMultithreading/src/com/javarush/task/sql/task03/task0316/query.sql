-- Write your code here:
-- В этой задаче тебе потребуется: 1. Выбрать колонки name и hq_location из таблицы top_retailers,
-- временно заменив name на ret_name, а hq_location на ret_location.
-- 2. Выбрать колонку name из таблицы suppliers, временно заменив имя колонки на sup_name.
-- 3. Временно заменить названия таблиц с top_retailers на retailer, и suppliers на supplier.
-- 4. Отфильтровать поиск по ритейлерам с доходом выше 100. Используй AS и WHERE.




SELECT retailer.name AS ret_name, retailer.hq_location AS ret_location, supplier.name AS sup_name
FROM top_retailers AS retailer,
     suppliers AS supplier
WHERE retailer.annual_revenue_billions > 100;
