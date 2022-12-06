-- Write your code here:
/*Напиши запрос, который из таблицы employee на основе даты рождения (date_of_birth)
  выберет год и месяц (номер) рождения каждого сотрудника. Год и месяц нужно выбрать в разные колонки.*/


SELECT YEAR (date_of_birth), MONTH (date_of_birth)
FROM employee;
