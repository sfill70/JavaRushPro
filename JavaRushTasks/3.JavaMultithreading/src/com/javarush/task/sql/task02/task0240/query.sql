-- Write your code here:
/*Заказчик считает, что старшие сотрудники более опытные. Напиши запрос,
  который из таблицы employee на основе года из даты рождения (date_of_birth) 
  выберет в первую колонку 'yes', если год меньше 2000 и 'no' в противном случае.
  Эту колонку нужно назвать experienced. Во вторую колонку нужно выбрать месяц рождения и назвать
  колонку month_of_birth. Используй IF().*/


SELECT YEAR (date_of_birth) AS experienced, MONTH (date_of_birth) AS month_of_birth
IF (YEAR (date_of_birth) < 2000, 'yes', 'no')
FROM employee
