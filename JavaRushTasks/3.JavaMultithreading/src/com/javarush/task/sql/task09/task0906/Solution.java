package com.javarush.task.sql.task09.task0906;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

/* 
task0906
Если ранее не подключал зависимости, то подключи их. Для этого Alt + Ctrl + Shift + S (в Идее),
 вкладка Libraries. Зависимости можна скачать здесь: https://javarush.com/downloads/ide/javarush/hibernate.zip
 Архив распакуй, и каждую зависимость добавь к модулю. Эта часть задания не проверяется, но если ее не выполнить -
 ты не сможешь локально выполнять код. Добавь в метод main код для дополнительной настройки SessionFactory.
 Укажи диалект "org.hibernate.dialect.MySQL8Dialect" и включи показ выполняемых SQL запросов.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
//        properties.put(Environment.URL, "jdbc:mysql://localhost:3306/test");
        properties.put(Environment.URL,  "jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        properties.put(Environment.USER, "root");
        properties.put(Environment.PASS, "q1w2e3r4ty");
        properties.put(Environment.SHOW_SQL, "true");
        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");

        //напишите тут ваш код

        SessionFactory sessionFactory = new Configuration()
                .setProperties(properties)
                .buildSessionFactory();
        sessionFactory.openSession();
    }
}
