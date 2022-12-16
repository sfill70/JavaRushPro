-- Write your code here:
# Напиши запрос, который поднимет зарплату (поле salary) на 1000 тем сотрудникам (таблица employee),
# у которых на дату (поле exp_date) '2022-10-01' нет просроченых задач (таблица task).
# Связь сотрудников с задачами реализована через поле employee_id в таблице task.

UPDATE employee SET employee.salary = employee.salary + 1000
WHERE employee.id IN (SELECT task.employee_id FROM task WHERE task.exp_date > '2022-10-01');
