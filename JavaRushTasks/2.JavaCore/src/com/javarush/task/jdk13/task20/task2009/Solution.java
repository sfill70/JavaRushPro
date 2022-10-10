package com.javarush.task.jdk13.task20.task2009;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.util.ArrayList;

/* 
Десериализация котов
НЕОБХОДИМО: подключенные библиотеки jackson-databind и jackson-dataformat-xml версии 2.13.1.
В метод getFromXml первым параметром приходит xml-строка, которая содержит один XML объект.
Вторым параметром приходит имя класса, объект которого находится в строке.
Метод getFromXml должен преобразовать объект из XML и вернуть его.
Используй метод readValue с параметрами (File, Class) или (Reader, Class).
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Cat cat = getFromXml("<Cat><name>Матроскин</name><cats><cats><name>кот1</name><cats/></cats><cats><name>кот2</name><cats/></cats><cats><name>кот3</name><cats/></cats></cats></Cat>", Cat.class);
        System.out.println(cat);
    }

    public static <T> T getFromXml(String xmlString, Class<T> clazz) throws IOException {
        ObjectMapper mapperXlm = new XmlMapper();
//        System.out.println(clazz.getName());
//        System.out.println(Cat.class);
//        System.out.println(Cat.class == clazz);
//        Class cl = clazz;
//        () c =  mapperXlm.readValue(xmlString, clazz);
//        System.out.println(cat);
        return mapperXlm.readValue(xmlString, clazz);
    }

    static class Cat {
        public String name;
        public ArrayList<Cat> cats = new ArrayList<>();

        public Cat() {
        }

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", cats=" + cats +
                    '}';
        }
    }
}

