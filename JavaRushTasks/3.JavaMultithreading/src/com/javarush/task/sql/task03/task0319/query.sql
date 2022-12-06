-- Write your code here:
/*В этой задаче тебе потребуется: 1. Выбрать колонки ret_name и ret_location из таблицы top_retailers,
  и колонки sup_name и sup_country из таблицы suppliers.
  2. Объединить таблицы оператором JOIN, придав им при этом временные названия
  r и s (для top_retailers и suppliers, соответственно).
  3. Добавить условие, что ret_location равно sup_country. Используй операторы JOIN, AS, и ON.*/



SELECT ret_name, ret_location, sup_name, sup_country
FROM top_retailers AS r
         JOIN suppliers AS s ON r.ret_location = s.sup_country;
