-- Write your code here:
# Напиши запрос, который всем сотрудникам (таблица employee), имеющим в названии позиции (поле position)
# слово 'developer', установит зарплату (поле salary) в размере 5000
# и сменит название позиции на 'fullstack developer'.

UPDATE employee
SET salary   = 5000,
    position = 'fullstack developer'
    WHERE position like '%developer%';
