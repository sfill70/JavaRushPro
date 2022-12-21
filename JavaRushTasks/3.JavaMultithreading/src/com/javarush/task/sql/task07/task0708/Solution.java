package com.javarush.task.sql.task07.task0708;

import java.sql.*;
import java.time.LocalDateTime;

/* 
Получение даты
В методе main создай подключение к БД с помощью метода getConnection(String, String, String) класса DriverManager.
Используй URL "jdbc:mysql://localhost:3306/test", пользователя "root" и такой же пароль.
Получи Statement используя метод createStatement без параметров.

Выведи в консоль из таблицы employee значения колонок name (VARCHAR) и created (TIMESTAMP),
разделенные пробелом. Значения колонки created представь в виде LocalDateTime.

Пример вывода:
Vasya 2020-01-01T10:10:10
Pasha 2019-12-31T23:40:10

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
            System.out.println(results.getString("name") + " "
                    + results.getObject("created", LocalDateTime.class));
        }
        statement.close();
        connection.close();

    }
}
