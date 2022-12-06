-- Write your code here:
-- Напиши запрос, который из таблицы data выберет год, месяц,
-- день из поля date и общую сумму значений из поля total, которые относятся к данному году, месяцу и дню.


SELECT YEAR (date), MONTH (date), DAY (date), sum (total)
FROM data
GROUP BY YEAR (date), MONTH (date), DAY (date);
