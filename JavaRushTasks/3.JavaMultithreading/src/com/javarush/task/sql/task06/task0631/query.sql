-- Write your code here:
# Напиши скрипт удаления FOREIGN KEY fk_user из таблицы event.


ALTER TABLE event
    DROP FOREIGN KEY fk_user;
