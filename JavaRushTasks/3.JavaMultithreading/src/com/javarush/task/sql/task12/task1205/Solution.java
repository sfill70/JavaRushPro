package com.javarush.task.sql.task12.task1205;

/* 
Сохранить аудио файл в БД
Если ранее не подключал зависимости, то подключи их. Для этого Alt + Ctrl + Shift + S (в Идее), вкладка Libraries.
Зависимости можна скачать здесь: https://javarush.com/downloads/ide/javarush/hibernate.zip
Архив распакуй, и каждую зависимость добавь к модулю. Эта часть задания не проверяется, но если ее не выполнить - ты не сможешь локально выполнять код.

Главная цель задачи - успешно сохранить аудио файл в sql базу данных, в виде массива байтов.
Для этого тебе потребуется:
1) Добавь в публичный класс Audio приватные поля: id (Long), fileName (String), audioFile (byte[]) и fileProperties (Map<String, String>).
2) У класса Audio должны присутствовать аннотации @Entity и @Table (имя таблицы audio_table, схема - test).
3) У всех полей должны присутствовать геттеры и сеттеры.
4) У всех полей должны присутствовать соответствующие аннотации.
4.1) У поля id должна присутствовать аннотация @Id.
4.2) У поля fileName должна присутствовать аннотация @Column, в которой указано имя колонки "file_name".
4.3) У поля audioFile должна присутствовать аннотация @Lob, и @Column, в которой указано имя колонки "audio_file".
4.4) У поля fileProperties должна присутствовать аннотация @Type с типом "json", и @Column, в которой указано имя колонки "file_meta".
5) В методе saveAudioFile класса Solution сохрани объект класса Audio и сделай коммит, используя методы getSessionFactory и getAudioBuffer. Номер id, имя файла и мета данные не участвуют в тестировании.

Для успешной работы программы тебе потребуется:
- Локально запустить sql сервер (localhost:3306) и создать базу данных с нужной схемой, таблицей и колонками. В базе данных следует учесть, что тип данных колонки audio_file может различаться, в зависимости от размера данных.
- В методе getAudioBuffer заменить ссылку на локальный аудио файл. Данный метод не участвует в тестировании.

Hint: тебе потребуется dependency от com.vladmihalcea, с artifactId "hibernate-types-55" и версией 2.19.2.
*/

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Properties;

public class Solution {
    public static void main(String[] args) {
        saveAudioFile();
    }

    public static void saveAudioFile() {
        //напишите тут ваш код
        try (Session session = getSessionFactory().openSession()) {
            Audio audio = new Audio();
            audio.setId(1L);
            audio.setFileName("Sound1");
            audio.setAudioFile(getAudioBuffer());
            audio.setFileProperties(Map.of("key1", "sound media1"));

            session.beginTransaction();
            session.save(audio);
            session.getTransaction().commit();
        }

    }

    public static SessionFactory getSessionFactory() {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        properties.put(Environment.URL, "jdbc:mysql://localhost:3306/test");
        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        properties.put(Environment.USER, "root");
        properties.put(Environment.PASS, "root");
        properties.put(Environment.HBM2DDL_AUTO, "update");

        return new Configuration()
                .setProperties(properties)
                .addAnnotatedClass(Audio.class)
                .buildSessionFactory();
    }

    public static byte[] getAudioBuffer() {
        byte[] audioBuffer;
        try {
            audioBuffer = Files.readAllBytes(Paths.get("sound.wav"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return audioBuffer;
    }
}
