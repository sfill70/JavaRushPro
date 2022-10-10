package com.javarush.task.jdk13.task21.task2106;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* 
Освобождаем ресурсы
Реализуй метод finalize, предварительно обдумав, что именно в нем должно быть.
Проведи рефакторинг метода getUsers в соответствии с java7 try-with-resources.


*/

public class Solution {
    private Connection connection;
    static int count = 0;

    public static void main(String[] args) {

        /*try {
            String s = String.class.newInstance();
            Method m = String.class.getMethod("length");
            System.out.println();
            int length = (int) m.invoke(s);
            System.out.println(length);
            System.out.println(Arrays.toString(String.class.getMethods()));
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {r
            throw new RuntimeException(e);
        } catch (SecurityException e) {
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }*/

        System.out.println(0);
        System.out.println(1);
        try {
            printFibonacci(0, 1);
        } catch (Exception e) {
            System.out.println(count + " rjkbxtcndj");
//            throw new RuntimeException(e);
        }
        System.out.println(count);

    }

    private static void printFibonacci(long penultimate, long previous) {
        count++;
        long current = penultimate + previous;
//        System.out.println(current);
        System.out.println(count);
        try {
            printFibonacci(previous, current);
        } catch (Exception e) {
            System.out.println(count + " rjkbxtcndj");
//            throw new RuntimeException(e);
        }
    }

    public Solution(Connection connection) {
        this.connection = connection;
    }

    public List<User> getUsers() {
        String query = "select ID, DISPLAYED_NAME, LEVEL, LESSON from USER";

        List<User> result = new LinkedList();

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)
        ) {
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("DISPLAYED_NAME");
                int level = rs.getInt("LEVEL");
                int lesson = rs.getInt("LESSON");

                result.add(new User(id, name, level, lesson));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            result = null;
        }
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if (connection != null) {
            connection.close();
        }
    }

    public static class User {
        private int id;
        private String name;
        private int level;
        private int lesson;

        public User(int id, String name, int level, int lesson) {
            this.id = id;
            this.name = name;
            this.level = level;
            this.lesson = lesson;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", level=" + level +
                    ", lesson=" + lesson +
                    '}';
        }
    }
}
