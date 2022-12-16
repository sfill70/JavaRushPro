-- Write your code here:
# В данной задаче тебе потребуется: 1. Создать таблицу с названием users.
# 2. Добавить обязательную колонку user_id с типом INT, без ограничения и с auto increment.
# 3. Добавить обязательную колонку first_name с типом VARCHAR и ограничением на 255 символов.
# 4. Добавить обязательную колонку last_name с типом VARCHAR и ограничением на 255 символов.
# 5. Добавить обязательную колонку date с типом DATE, без ограничения и с обращением к методу GETDATE(), как дефолтное значение.
# 6. Добавить не обязательную колонку weight с типом FLOAT и ограничением на 10 символов.
# 7. Указать колонку user_id как PRIMARY KEY.


CREATE TABLE `users`
(
    `user_id`    INT          not null auto_increment,
    `first_name` VARCHAR(255) not null,
    `last_name`  VARCHAR(255) not null,
    `date`       DATE         not null DEFAULT  (CURRENT_DATE ),
    `weight`     FLOAT(10) null,
    PRIMARY KEY (user_id)
);