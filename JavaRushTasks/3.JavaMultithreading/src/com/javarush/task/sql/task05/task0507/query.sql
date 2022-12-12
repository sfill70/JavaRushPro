-- Write your code here:
# Внеси изменения в таблицу part: - детали с номером 92909
# смени название на 'Technic, Steering Wheel Hub 3 Pin Round';
# - детали с номером 19916
# смени название на 'Minifigure, Headgear Helmet SW Darth Vader Type 2 Top'.

update part
set name = 'Technic, Steering Wheel Hub 3 Pin Round'
where number = '92909';

update part
set name = 'Minifigure, Headgear Helmet SW Darth Vader Type 2 Top'
where number = '19916';
