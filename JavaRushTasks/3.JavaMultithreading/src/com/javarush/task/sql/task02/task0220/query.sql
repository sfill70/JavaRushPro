-- Write your code here:
/*Напиши запрос, который согласно данных из поля prod_year таблицы cars вернет name и такую информацию:
  - 'new', если значение prod_year равно 2020 - 'newer',
  если значение prod_year равно 2021 - 'even newer',
  если значение prod_year равно 2022 В итоговой выборке не должно быть повторов.*/




SELECT DISTINCT name,
                CASE prod_year
                    WHEN 2020 THEN 'new'
                    WHEN 2021 THEN 'newer'
                    WHEN 2022 THEN 'even newer'
                    END
FROM cars;
