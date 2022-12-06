-- Write your code here:
/*1. Выбрать все колонки из таблицы authors.
  2. Добавить условие, что колонка full_name не должна (используй NOL LIKE)
  включать в себя результат подзапроса.
  3. В подзапросе, через конкатенацию следует выбрать колонки first_name и last_name,
  добавив между ними пробел. Затем, дополнительно указать, что last_name должно быть равно 'Shakespeare'.*/



SELECT *
FROM authors
WHERE full_name NOT LIKE (SELECT CONCAT(first_name, ' ', last_name) FROM authors WHERE last_name = 'Shakespeare')
