package com.javarush.task.sql.task08.task0807;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/* 
task0807
В конструкторе HikariCPDataSource выполни настройку HikariCP:

инициализируй поле config;
установи полю config параметры подключения к БД: URL "jdbc:mysql://localhost:3306/test", пользователя "root" и такой же пароль;
инициализируй поле ds, передав в конструктор поле config.
*/

public class Solution {

  /*  public static void main(String[] args) throws Exception {
        List<Employee> employees = new ArrayList<>();
        try (Connection con = HikariCPDataSource.getConnection();
             PreparedStatement pst = con.prepareStatement("select * from employee");
             ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                employees.add(new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("smth")));
            }
        }

        employees.forEach(System.out::println);
    }*/
}
