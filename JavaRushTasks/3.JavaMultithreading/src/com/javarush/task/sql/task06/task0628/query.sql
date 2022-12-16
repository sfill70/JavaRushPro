-- Write your code here:
# Напиши запрос, который удалит индексы name_index и salary_index из таблицы employee. Используй ALTER TABLE.


ALTER TABLE employee
    DROP INDEX name_index,
    DROP INDEX salary_index;
