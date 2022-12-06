-- Write your code here:
/*Напиши запрос, который из таблицы employee выберет информацию о том,
  сколько сотрудников, в должности (position) которых присутствует слово 'developer',
  родилось (date_of_birth) в определенном году. Колонка с годом в результате
  должна иметь название year_of_birth.*/




SELECT YEAR (date_of_birth) AS year_of_birth, count (*)
FROM employee
WHERE position LIKE '%developer%'
GROUP BY YEAR (date_of_birth);
