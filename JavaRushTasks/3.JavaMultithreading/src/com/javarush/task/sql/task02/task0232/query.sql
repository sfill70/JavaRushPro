-- Write your code here:
/*Напиши запрос, который покажет количество студентов (таблица students)
  заочников (is_full_time = 'no') и стационара (is_full_time = 'yes').*/

SELECT is_full_time, count(*)
FROM students
GROUP BY is_full_time;
