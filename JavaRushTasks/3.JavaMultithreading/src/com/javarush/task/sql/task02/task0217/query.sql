-- Write your code here:


/*Напиши запрос, который согласно данных из поля euro таблицы cars вернет такую информацию: - 'best',
  если значение euro больше 5 - 'good', если значение euro равно 5 - 'bad',
  при любом другом значении euro Результат ограничь 5 записями, отсортируй по цене (поле price),
  год выпуска (prod_year) должен быть больше (новее) 2020.*/

SELECT CASE
           WHEN euro > 5 THEN 'best'
           WHEN euro = 5 THEN 'good'
           ELSE 'bad'
           END
FROM cars
WHERE prod_year > 2020 ORDER BY prod_year LIMIT 5;

