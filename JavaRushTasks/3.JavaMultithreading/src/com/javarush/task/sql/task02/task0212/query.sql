-- Write your code here:
-- Напиши запрос, который согласно данных из таблицы employee для города (city) 'London'
-- вернет такую информацию: - 'good', если должность (position) 'manager' и зарплата (salary) больше 10000
-- - 'good', если должность (position) НЕ 'manager' и зарплата (salary) больше 5000 - 'bad',
-- если должность (position) 'manager' и зарплата (salary) меньше либо равна 10000 - 'bad',
-- если должность (position) НЕ 'manager' и зарплата (salary) меньше либо равна 5000
-- Используй запрос вида SELECT IF(<условие>, IF(...), IF(...)) FROM <таблица> WHERE ...




SELECT IF(position = 'manager',
    IF(salary>10000, 'good', 'bad'),
    IF(salary>5000, 'good', 'bad'))
FROM employee WHERE citi = 'London';

