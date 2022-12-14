-- Write your code here:
# Получи из таблицы lego_set колонки name, released, inventory.
# Отсортируй данные по годам, сначала более старые. Внутри одного года отсортируй по
# inventory по возрастанию.


# SELECT name, released, inventory FROM lego_set order by  released DESC;

SELECT name, released, inventory FROM lego_set order by released, inventory;
