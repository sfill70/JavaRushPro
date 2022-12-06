-- Write your code here:
/*Напиши запрос, который из таблицы employee выберет информацию о том,
  сколько сотрудников родилось (date_of_birth) в определенном году.*/


SELECT YEAR (date_of_birth), count (*)
FROM employee
GROUP BY YEAR (date_of_birth);


