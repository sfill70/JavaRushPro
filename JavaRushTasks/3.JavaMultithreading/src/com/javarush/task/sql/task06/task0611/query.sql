-- Write your code here:
/*Напиши запрос, который всем автомобилям в таблице cars установит название (name) 'New Car', год выпуска (prod_year) 2023 и
  стоимость (price) 1000000.*/

UPDATE cars
SET name      = 'New Car',
    prod_year = 2023,
    price     = 1000000;