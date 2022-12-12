-- Write your code here:
# Внеси изменения в таблицу author: - у автора с полным именем
# 'C. S. Lewis' измени полное имя на 'Clive Staples Lewis';
# - у автора с полным именем
# 'J. R. R. Tolkien' измени полное имя на 'John Ronald Reuel Tolkien';
# - у автора с полным именем
# 'Friedrich Nietzsche' измени полное имя на 'Friedrich Wilhelm Nietzsche';
# - у автора с полным именем
# 'Stephen King' измени полное имя на 'Stephen Edwin King'; -
# у автора с полным именем 'Aldous Huxley' измени полное имя на 'Aldous Leonard Huxley'.

update author
set full_name = 'Clive Staples Lewis'
where full_name = 'C. S. Lewis';

update author
set full_name = 'John Ronald Reuel Tolkien'
where full_name = 'J. R. R. Tolkien';

update author
set full_name = 'Friedrich Wilhelm Nietzsche'
where full_name = 'Friedrich Nietzsche';

update author
set full_name = 'Stephen Edwin King'
where full_name = 'Stephen King';

update author
set full_name = 'Aldous Leonard Huxley'
where full_name = 'Aldous Huxley';