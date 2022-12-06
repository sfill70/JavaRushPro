-- Write your code here:
/*Напиши запрос, который из таблицы employee на основе даты рождения (date_of_birth) выберет год,
  месяц (номер) рождения и количество сотрудников, родившихся в этот год и месяц.
  Год и месяц нужно выбрать в разные колонки.*/


/*SELECT YEAR (date_of_birth), MONTH (date_of_birth), count (*)
FROM employee
GROUP BY YEAR (date_of_birth), MONTH (date_of_birth);*/


SELECT YEAR (date_of_birth), MONTH (date_of_birth), count (*)
FROM employee
GROUP BY YEAR (date_of_birth), MONTH (date_of_birth)