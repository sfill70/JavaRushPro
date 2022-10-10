package com.javarush.task.jdk13.task34.task3408;

/* 
Генератор объектов
Разберись с текущими классами. Метод newInstance класса Generator должен создавать и
возвращать Event для каждого нового вызова, однако сейчас он возвращает null.
Переделай класс Generator так, чтобы конструкция стала рабочей.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Generator<Event> eventGenerator = new Generator<>(Event.class);

        System.out.println(eventGenerator.newInstance().getId());
        System.out.println(eventGenerator.newInstance().getId());
        System.out.println(eventGenerator.newInstance().getId());
    }
}
