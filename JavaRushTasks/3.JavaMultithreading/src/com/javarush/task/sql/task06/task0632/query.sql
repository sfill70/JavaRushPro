-- Write your code here:
# Напиши скрипт добавления FOREIGN KEY с опциями ON UPDATE CASCADE, ON DELETE SET NULL в таблицу event по
# полю user_id с ссылкой на поле id таблицы users.


ALTER TABLE event
    ADD FOREIGN KEY (user_id)
        REFERENCES users (id)
        ON UPDATE CASCADE
        ON DELETE SET NULL;