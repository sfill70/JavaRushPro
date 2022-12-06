-- Write your code here:
/*Требуется выбрать колонки rank и name из таблицы top_retailers,
  но временно заменив обращение к колонке top_retailers.rank на company_rank,
  а к колонке top_retailers.name на company_name.
  Также следует выбрать колонку annual_revenue_billions из таблицы suppliers,
  временно заменив название на supplier_revenue.
  И еще давай добавим фильтр по колонке annual_revenue_billions таблицы suppliers,
  чтобы в результате отображались suppliers только с доходом выше 25.
  Используй AS и WHERE.*/


SELECT top_retailers.rank                AS company_rank,
       top_retailers.name                AS company_name,
       suppliers.annual_revenue_billions AS supplier_revenue
FROM top_retailers,
     suppliers
WHERE suppliers.annual_revenue_billions > 25;