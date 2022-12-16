-- Write your code here:
# Напиши запрос, который поднимет зарплату (поле salary) на 500 сотрудникам (таблица employee),
# у которых позиция (поле position) менеджер ('manager').


UPDATE employee SET employee.salary = employee.salary + 500
WHERE position = 'manager';
