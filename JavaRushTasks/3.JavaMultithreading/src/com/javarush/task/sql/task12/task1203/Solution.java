package com.javarush.task.sql.task12.task1203;

/* 
Сохраняем объект в БД
Если ранее не подключал зависимости, то подключи их. Для этого Alt + Ctrl + Shift + S (в Идее),
вкладка Libraries. Зависимости можно скачать здесь: https://javarush.com/downloads/ide/javarush/hibernate.zip
Архив распакуй, и каждую зависимость добавь к модулю. Эта часть задания не проверяется, но если ее не выполнить -
ты не сможешь локально выполнять код.
1) Добавь в публичный класс TimeClass приватные поля: id (Long), instant (Instant)
и zonedDateTime (ZonedDateTime).
2) У класса TimeClass должны присутствовать аннотации @Entity и @Table (имя таблицы time_table,
 схема - test).
 3) У всех полей должны присутствовать геттеры и сеттеры.
 4) У всех полей должны присутствовать соответствующие аннотации.
 4.1) У поля id должна присутствовать аннотация @Id.
 4.2) У поля instant должна присутствовать аннотация @Column, в которой указано имя колонки "instant".
 4.3) У поля zonedDateTime должна присутствовать аннотация @Basic и аннотация @Column,
 в которой указано имя колонки "zoned_time".
 5) В методе main класса Solution следует создать объект класса TimeClass и используя сеттеры установить значения для id,
 Instant и ZonedDateTime.
 5.1) Для сеттера id используй любое значение.
 5.2) Для сеттера Instant используй статический метод ofEpochSecond с любым значением.
 5.3) Для сеттера ZonedDateTime используй статический метод now, которому надо передать статический метод systemDefault
 класса ZoneId.
 6) Используя метод getSessionFactory, в методе main следует начать транзакцию, сохранить объект
 класса TimeClass и сделать коммит. Для выполнения задания тебе потребуется локально запустить сервер (localhost:3306)
 и создать базу данных с нужной схемой, таблицей и колонками.
*/

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Properties;

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        TimeClass timeClass = new TimeClass();

        timeClass.setId(1L);
        timeClass.setInstant(Instant.ofEpochSecond(10));
        timeClass.setZonedDateTime(ZonedDateTime.now(ZoneId.systemDefault()));

        try (Session session = getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(timeClass);
            session.getTransaction().commit();
        }
    }

    public static SessionFactory getSessionFactory() {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        properties.put(Environment.URL, "jdbc:mysql://localhost:3306/test");
        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        properties.put(Environment.USER, "root");
        properties.put(Environment.PASS, "q1w2e3r4ty");
        SessionFactory sessionFactory = new Configuration()
                .setProperties(properties)
                .addAnnotatedClass(TimeClass.class)
                .buildSessionFactory();

        return sessionFactory;
    }
}
