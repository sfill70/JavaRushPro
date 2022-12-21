package com.javarush.task.sql.task08.task0806;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

/* 
task0806
В методе main создай подключение к БД с помощью метода getConnection(String, String, String) класса DriverManager.
Используй URL "jdbc:mysql://localhost:3306/test", пользователя "root" и такой же пароль.
Получи Statement, используя метод createStatement без параметров.
Получи все строки и колонки из таблицы employee.
Преобразуй их в объекты Employee и помести их в множество employees.

Закрой Statement и Connection.
*/

public class Solution {

    public static Set<Employee> employees = new HashSet<>();

    public static void main(String[] args) throws Exception {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
             Statement statement = connection.createStatement()) {
            ResultSet results = statement.executeQuery("SELECT * FROM employee");
            while (results.next()) {
                employees.add(new Employee(
                        results.getInt(1),
                        results.getString("name"),
                        results.getInt("age"),
                        results.getString("smth")));
            }
        }

        employees.forEach(System.out::println);
    }
}
