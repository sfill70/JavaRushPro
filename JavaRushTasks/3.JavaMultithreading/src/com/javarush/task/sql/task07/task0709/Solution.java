package com.javarush.task.sql.task07.task0709;

import java.sql.*;

/* 
Метод getObject
В методе main создай подключение к БД с помощью метода getConnection(String, String, String) класса DriverManager.
Используй URL "jdbc:mysql://localhost:3306/test", пользователя "root" и такой же пароль.
Получи Statement используя метод createStatement без параметров.

Выведи в консоль из таблицы employee значения колонок name (VARCHAR), weight (FLOAT), birthday (DATE) и inn (LONG)
разделенные пробелом.

Пример вывода:
Pasha 73.7 null 2222222222
Nastya null 1997-07-17 null

Закрой Statement и Connection.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root", "root");

        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery("select * from employee");

        while (results.next()) {
            System.out.printf("%s %s %s %s\n",
                    results.getString("name"),
                    results.getObject("weight", Float.class),
                    results.getDate("birthday"),
                    results.getObject("inn", Long.class));
        }
        statement.close();
        connection.close();

    }
}
