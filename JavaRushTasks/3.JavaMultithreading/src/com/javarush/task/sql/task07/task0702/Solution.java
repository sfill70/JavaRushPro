package com.javarush.task.sql.task07.task0702;

import java.sql.*;

/*
В методе main создай подключение к БД с помощью метода getConnection(String, String, String) класса DriverManager.
Используй URL "jdbc:mysql://localhost:3306/test", пользователя "root" и такой же пароль.
Получи Statement используя метод createStatement без параметров. С помощью этого Statement выполни запрос "select 7 * 8".
Закрой Statement и Connection.
task0702
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection  = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root", "root");

        Statement statement = connection.createStatement();
        statement.executeQuery("select 7 * 8");

        statement.close();
        connection.close();
    }
}
