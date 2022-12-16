-- Write your code here:
# Добавь в таблицу sale_addresses информацию из колонок street, city, state, zip_code и country таблицы customers,
# но без данных из страны с названием Testostan.

INSERT INTO sale_addresses (street, city, state, zip_code, country)
SELECT street, city, state, zip_code, country FROM customers
WHERE customers.country NOT LIKE '%Testostan%';
