package com.javarush.task.pro.task15.task1533;

/* 
Замена потока
*/

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Solution {

    public static void main(String[] args) throws IOException {
        writeData("Justinian", "Justinian@mega.city.one", 41, 391);
//        System.out.println( writeData("Justinian", "Justinian@mega.city.one", 41, 391));
    }

    /*public static void writeData(String name, String email, int level, int rating) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\uzer\\IdeaProjects\\temp.txt")) {
            fos.write(("Имя: " + name + "\n").getBytes(StandardCharsets.UTF_8));
            fos.write(("Почта: " + email + "\n").getBytes(StandardCharsets.UTF_8));
            fos.write(("Уровень: " + level + "\n").getBytes(StandardCharsets.UTF_8));
            fos.write(("Рейтинг: " + rating + "\n").getBytes(StandardCharsets.UTF_8));
        }
    }*/

    public static ByteArrayOutputStream writeData(String name, String email, int level, int rating) throws IOException {
        try (ByteArrayOutputStream stream = new ByteArrayOutputStream()) {
            stream.write(("Имя: " + name + "\n").getBytes(StandardCharsets.UTF_8));
            stream.write(("Почта: " + email + "\n").getBytes(StandardCharsets.UTF_8));
            stream.write(("Уровень: " + level + "\n").getBytes(StandardCharsets.UTF_8));
            stream.write(("Рейтинг: " + rating + "\n").getBytes(StandardCharsets.UTF_8));
            return stream;
        }
    }
}
