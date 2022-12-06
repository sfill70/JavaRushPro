-- Write your code here:
/*Напиши запрос, который из таблицы employee выберет рейтинг (rating) сотрудников и
  список имен (name) сотрудников с данным рейтингом. В выборку должны попасть только те,
  у кого рейтинг выше 2 (строго больше). Результат выведи в порядке возрастания рейтинга.*/




SELECT rating, group_concat(name)
FROM employee
GROUP BY rating
HAVING  rating > 2
ORDER BY rating;
