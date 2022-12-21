package com.javarush.task.sql.task07.task0707;

import java.sql.*;

/* 
Метод wasNull
В методе main создай подключение к БД с помощью метода getConnection(String, String, String) класса DriverManager. Используй URL "jdbc:mysql://localhost:3306/test", пользователя "root" и такой же пароль. Получи Statement используя метод createStatement без параметров.

Выведи в консоль из таблицы employee значения колонок name (VARCHAR) и weight (FLOAT) разделенные пробелом.

Пример вывода:
Vasya 73.3
Pasha 0.0
Sasha 40.2
Dima null
Sasha null

Закрой Statement и Connection.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root", "root");

        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery("select name, weight from employee");

        while (results.next()) {
            Double weight = results.getDouble("weight");
            if (results.wasNull()) {
                weight = null;
            }

            System.out.println(results.getObject("name") + " " + weight);
        }
        statement.close();
        connection.close();

    }
}
