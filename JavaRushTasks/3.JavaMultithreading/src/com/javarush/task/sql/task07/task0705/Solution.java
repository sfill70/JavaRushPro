package com.javarush.task.sql.task07.task0705;

import java.sql.*;

/* 
task0705
В методе main создай подключение к БД с помощью метода getConnection(String, String, String) класса DriverManager.
 Используй URL "jdbc:mysql://localhost:3306/test", пользователя "root" и такой же пароль.
 Получи Statement используя метод createStatement без параметров.
 Выведи в консоль минимальное значение колонки age таблицы employee. Тип колонки - INT.
 Закрой Statement и Connection.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root", "root");

        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery("select min(age) from employee");

       /* while (results.next()) {
            int minAge = results.getInt(1);
            System.out.println(minAge);
        }*/

        results.next();
        System.out.println(results.getInt(1));


        statement.close();
        connection.close();

    }
}
