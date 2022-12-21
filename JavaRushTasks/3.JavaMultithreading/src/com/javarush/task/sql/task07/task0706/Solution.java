package com.javarush.task.sql.task07.task0706;

import java.sql.*;

/* 
task0706
В методе main создай подключение к БД с помощью метода getConnection(String, String, String) класса DriverManager.
Используй URL "jdbc:mysql://localhost:3306/test", пользователя "root" и такой же пароль.
Получи Statement используя метод createStatement без параметров. Выполни запрос "select * from employee limit 1".
Для каждой колонки результата выведи в консоль название колонки и в скобках тип колонки.
Пример вывода: id(INT) name(VARCHAR) age(INT) smth(VARCHAR) Закрой Statement и Connection.
*/

public class Solution {

//    static final String URL = "jdbc:mysql://localhost:3306/skillbox?useSSL=false&serverTimezone=UTC";
//    static final String URL = "jdbc:mysql://localhost:3306/skillbox";
//    static final String URL = "jdbc:mysql://localhost:3306/skillbox?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
//static final String URL="jdbc:mysql://localhost:3306/skillbox?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASSWORD = "q1w2e3r4ty";

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root", "root");

       /* Connection connection = DriverManager.getConnection(
                URL,
                USER, PASSWORD);*/

        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery("select * from employee");

       /* while (results.next()) {
            int minAge = results.getInt(1);
            System.out.println(minAge);
        }*/

        ResultSetMetaData metaData = results.getMetaData();
        for (int i = 1; i <= metaData.getColumnCount(); i++) {
            System.out.println(metaData.getColumnName(i) + "(" + metaData.getColumnTypeName(i) + ")");
        }
        statement.close();
        connection.close();

    }
}
