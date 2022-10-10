package com.javarush.task.jdk13.task34.task3409;

/* 
Первый попавшийся конструктор
Разберись с текущими классами. Метод newInstance объекта Generator должен возвращать
объект того класса который он получил в конструкторе, однако сейчас при запуске возникает исключение.
Исправь метод newInstance, что бы конструкция стала рабочей.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Generator<Event> eventGenerator = new Generator<>(Event.class);

        System.out.println(eventGenerator.newInstance());
        System.out.println(eventGenerator.newInstance());
        System.out.println(eventGenerator.newInstance());
        System.out.println(new Generator<>(Solution.class).newInstance());
        System.out.println(new Generator<>(NullPointerException.class).newInstance());
    }
}
