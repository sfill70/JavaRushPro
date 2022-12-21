package com.javarush.task.sql.task08.task0801;

import java.sql.*;

/* 
Работа с транзакциями
В методе main создай подключение к БД с помощью метода getConnection(String, String, String) класса DriverManager.
Используй URL "jdbc:mysql://localhost:3306/test", пользователя "root" и такой же пароль.
Отключи AutoCommit.
Получи Statement, используя метод createStatement без параметров.

Сотруднику (таблица employee) с полем name, равному Diego, увеличь значение salary на 2000.
Сотруднику (таблица employee) с полем name, равному Amigo, увеличь значение salary на 500.
Выполни commit.

Закрой Statement и Connection.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root", "root");

        connection.setAutoCommit(false);
        Statement statement = connection.createStatement();
        statement.executeUpdate("update employee set salary = salary + 2000 where name = 'Diego'");
        statement.executeUpdate("update employee set salary = salary + 500 where name = 'Amigo'");
        connection.commit();
        statement.close();
        connection.close();

    }
}
