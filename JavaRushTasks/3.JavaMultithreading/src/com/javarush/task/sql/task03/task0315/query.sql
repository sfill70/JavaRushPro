-- Write your code here:
/*В этой задаче тебе потребуется:
  1. Выбрать колонку hq_location из таблицы top_retailers, временно заменив имя колонки на ret_location.
  2. Выбрать колонку annual_revenue_billions из таблицы suppliers,
  временно заменив имя колонки на sup_revenue.
  3. Временно заменить названия таблиц с top_retailers на ret, и suppliers на sup.
  4. Исключить из поиска все локации 'USA' таблицы top_retailers. Используй AS и WHERE.*/



SELECT ret.hq_location             AS ret_location,
       sup.annual_revenue_billions AS sup_revenue,
FROM top_retailers AS ret,
     suppliers AS sup
WHERE ret.hq_location != 'USA';
