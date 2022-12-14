-- Write your code here:
# Получи из таблицы part колонку name. Отфильтруй данные: нужны только те значения
# которые дважды содержат строку 'Slope' или дважды содержат строку 'Clip'.

SELECT name
FROM part
where name like '%Slope%Slope%'
   or name like '%Clip%Clip%';