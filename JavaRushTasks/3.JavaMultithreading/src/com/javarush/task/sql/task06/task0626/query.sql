-- Write your code here:
# Напиши запрос, который создаст индексы в таблице employee: position_index по колонке position и salary_index по колонке salary.

ALTER TABLE employee
    ADD INDEX position_index (position, salary_index);
