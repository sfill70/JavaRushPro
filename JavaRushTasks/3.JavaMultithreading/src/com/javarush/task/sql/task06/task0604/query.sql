-- Write your code here:
# В данной задаче тебе потребуется: 1. Создать таблицу с названием users.
# 2. Добавить обязательную колонку user_id с типом INT, без ограничения и с auto increment.
# 3. Добавить обязательную колонку first_name с типом VARCHAR и ограничением на 255 символов.
# 4. Добавить обязательную колонку last_name с типом VARCHAR и ограничением на 255 символов.
# 5. Указать колонку user_id как PRIMARY KEY.


CREATE TABLE `users`
(
    `user_id`    INT          not null auto_increment,
    `first_name` VARCHAR(255) not null,
    `last_name`  VARCHAR(255) not null,
    PRIMARY KEY (user_id)
);

