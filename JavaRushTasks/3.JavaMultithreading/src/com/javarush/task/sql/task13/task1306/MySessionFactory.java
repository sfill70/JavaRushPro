package com.javarush.task.sql.task13.task1306;

import com.javarush.task.sql.task13.task1306.entities.Author;
import com.javarush.task.sql.task13.task1306.entities.Book;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

public class MySessionFactory {
    private static MySessionFactory instance;
    private final SessionFactory sessionFactory;

    private MySessionFactory() {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
        properties.put(Environment.URL, "jdbc:mysql://localhost:3306/library");
        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        properties.put("hibernate.connection.useUnicode", true);
        properties.put("hibernate.connection.characterEncoding", "UTF-8");
        properties.put("hibernate.connection.charSet", "UTF-8");
        properties.put(Environment.USER, "root");
        properties.put(Environment.PASS, "q1w2e3r4ty");

        sessionFactory = new Configuration()
                .setProperties(properties)
                .addAnnotatedClass(Author.class)
                .addAnnotatedClass(Book.class)
                .buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        if (instance == null) {
            instance = new MySessionFactory();
        }
        return instance.sessionFactory;
    }
}