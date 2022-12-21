package com.javarush.task.sql.task08.task0804;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/* 
task0804
В методе main создай подключение к БД с помощью метода getConnection(String, String, String) класса DriverManager.
Используй URL "jdbc:mysql://localhost:3306/test", пользователя "root" и такой же пароль.
Получи PreparedStatement, используя метод prepareStatement, передав в качестве параметра переменную sql.

В batch-режиме добавь в таблицу пять записей:

('employee_0', 30, 'i = 0'),
('employee_1', 31, 'i = 1'),
...
('employee_4', 34, 'i = 4').
Закрой Statement и Connection.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String sql = "insert into employee (name, age, smth) values (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
             PreparedStatement statement = connection.prepareStatement(sql)) {
            for (int i = 0; i < 5; i++) {
                statement.setString(1, "employee_" + i);
                statement.setInt(2, 30 + i);
                statement.setString(3, "i = " + i);
                statement.addBatch();
            }
            statement.executeBatch();
        }

    }
}
