-- Write your code here:
/*Напиши запрос, который из таблицы employee выберет информацию о том,
  сколько в каждом департаменте (department) сотрудников со специальностью (position)
  'frontend developer' или (OR) 'backend developer'.
  Колонка с департаментом в результате должна иметь название department_name,
  а колонка с количеством - count.*/



SELECT department AS department_name, count(*) AS count
FROM employee
WHERE position = 'frontend developer' OR position = 'backend developer'
GROUP BY department;