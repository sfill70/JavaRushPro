-- Write your code here:
/*Напиши запрос, который из таблицы employee выберет позиции (position) и список имен (name)
  сотрудников на каждой позиции. В выборку должны попасть только позиции со словом 'developer'
  в названии. Используй GROUP_CONCAT и HAVING.*/

SELECT position, group_concat(name)
FROM employee
GROUP BY position
HAVING  position LIKE '%developer%';
