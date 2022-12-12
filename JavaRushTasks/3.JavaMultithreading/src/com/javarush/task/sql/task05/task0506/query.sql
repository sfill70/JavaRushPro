-- Write your code here:
# В таблице publisher у издателя с названием 'Wordsworth Editions' смени название на 'Авторское издание'.


update publisher
set name = 'Авторское издание'
where name = 'Wordsworth Editions';