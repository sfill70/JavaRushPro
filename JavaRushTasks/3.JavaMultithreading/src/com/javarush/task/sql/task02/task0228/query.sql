-- Write your code here:
/*Напиши запрос, который из таблицы employee выберет информацию о том,
  сколько в каждом департаменте (department) сотрудников.
  Колонка с количеством в результате должна иметь название number_of_employees.*/



SELECT department, count(*) AS number_of_employees
FROM employee
GROUP BY department;
