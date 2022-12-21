package com.javarush.task.sql.task07.task0703;

import java.sql.*;

/* 
task0703
В методе main создай подключение к БД с помощью метода getConnection(String, String, String) класса DriverManager.
Используй URL "jdbc:mysql://localhost:3306/test", пользователя "root" и такой же пароль.
Получи Statement используя метод createStatement без параметров.
С помощью этого Statement выполни запрос к БД: получи все строки и колонки из таблицы employee. Закрой Statement и Connection.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root", "root");

        Statement statement = connection.createStatement();
        statement.executeQuery("select * from employee");

        statement.close();
        connection.close();

    }
}
