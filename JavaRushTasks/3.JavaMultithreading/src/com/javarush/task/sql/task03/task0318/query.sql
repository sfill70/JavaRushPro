-- Write your code here:
/*В этой задаче тебе потребуется: 1. Выбрать колонки ret_name и ret_revenue из таблицы top_retailers,
  и колонки sup_name и sup_revenue из таблицы suppliers. 2. Объединить таблицы оператором JOIN.
  3. Добавить условие, что ret_revenue таблицы top_retailers равно sup_revenue таблицы suppliers.
  Используй операторы JOIN и ON.*/



SELECT ret_name, ret_revenue,sup_name, sup_revenue
FROM top_retailers
         JOIN suppliers ON top_retailers.ret_revenue = sup_revenue;
