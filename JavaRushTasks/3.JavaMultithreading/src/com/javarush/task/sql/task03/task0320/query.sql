-- Write your code here:
/*В этой задаче тебе потребуется:
  1. Выбрать колонки ret_name и ret_revenue из таблицы top_retailers, и колонки sup_name и sup_revenue
  из таблицы suppliers. 2. Объединить таблицы оператором JOIN,
  придав им при этом временные названия retailer и supplier
  (для top_retailers и suppliers, соответственно). 3. Добавить условие, что ret_revenue равно sup_revenue.
  4. Добавить условие, что sup_revenue должно быть больше 50. Используй операторы JOIN, AS, ON и WHERE.*/



SELECT ret_name, ret_revenue, sup_name, sup_revenue
FROM top_retailers AS retailer
         JOIN suppliers AS supplier ON retailer.ret_revenue = supplier.sup_revenue
WHERE retailer.ret_revenue > 50;
