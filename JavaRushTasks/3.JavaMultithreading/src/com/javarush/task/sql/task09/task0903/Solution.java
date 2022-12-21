package com.javarush.task.sql.task09.task0903;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

/*
task0903
Если ранее не подключал зависимости, то подключи их. Для этого нажми Alt + Ctrl + Shift + S (в Идее), вкладка Libraries.
Зависимости можно скачать здесь.
Архив распакуй, и каждую зависимость добавь к модулю. Эта часть задания не проверяется, но если ее не выполнить —
ты не сможешь локально выполнять код.

Добавь в метод main код для конфигурирования SessionFactory, в конфигурации укажи entity-класс Animal.
При конфигурировании в качестве драйвера необходимо использовать "com.mysql.jdbc.Driver", URL "jdbc:mysql://localhost:3306/test",
диалект "org.hibernate.dialect.MySQLDialect", пользователя "root" и такой же пароль.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
        properties.put(Environment.URL, "jdbc:mysql://localhost:3306/test");
        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        properties.put(Environment.USER, "root");
        properties.put(Environment.PASS, "root");

        SessionFactory sessionFactory = new Configuration()
                .setProperties(properties)
                .addAnnotatedClass(Animal.class)
                .buildSessionFactory();
    }
}