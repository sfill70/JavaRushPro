-- Write your code here:
-- Известно, что первые 4 сотрудника (согласно id) - это руководство компании и стоит задача проверить,
-- кто получает больше 1000, а кто нет. Нужно выбрать id и 'yes' (если salary строго больше 1000)
-- или 'no' (если salary меньше 1000) из таблицы employee, у кого значение поля id строго меньше 5.
-- Используй оператор IF()

SELECT id, IF(salary > 1000, 'yes', 'no') FROM employee WHERE id < 5;

SELECT id
FROM employee
WHERE id < 5 IF(salary>1000, 'yas', 'no');
