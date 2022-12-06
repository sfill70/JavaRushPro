-- Write your code here:
/*В этой задаче тебе потребуется: 1. Выбрать все колонки из таблиц top_retailers и suppliers,
  объединив их при этом оператором JOIN. 2. Добавить условие, что ret_location таблицы top_retailers
  равно sup_country таблицы suppliers. Используй операторы JOIN и ON.*/



SELECT *
FROM top_retailers
         JOIN suppliers ON top_retailers.ret_location = suppliers.sup_country;
