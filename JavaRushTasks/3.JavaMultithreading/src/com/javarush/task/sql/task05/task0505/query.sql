-- Write your code here:
# Добавь в таблицу object четыре объекта: -
# открытый 12 декабря 2020 года системой 'Pan-STARRS 1' астероид '2020 XL5';
# - спутник Земли 'Moon', открывателя и дату открытия оставить null;
# - планету 'Jupiter'; - открытую 17 января 1910 года астрономом 'Robert T. A. Innes'
# комету 'C/1910 A1'.

insert into object (name, type, discoverer, discovery_date)
values ('2020 XL5', 'ASTEROID', 'Pan-STARRS 1', '2020-12-12'),
       ('Moon', 'SATELLITE', null, null),
       ('Jupiter', 'PLANET', null, null),
       ('C/1910 A1', 'COMET', 'Robert T. A. Innes', '1910-01-17');

