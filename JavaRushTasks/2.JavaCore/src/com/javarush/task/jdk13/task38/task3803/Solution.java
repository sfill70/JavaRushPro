package com.javarush.task.jdk13.task38.task3803;

/* 
Обработка аннотаций
В классе Solution необходимо реализовать простейшую обработку аннотаций.

В методы printFullyQualifiedNames() и printValues() приходит класс.
Если этот класс отмечен аннотацией PrepareMyTest, необходимо вывести на экран fullyQualifiedNames
и values в соответствующих методах и вернуть true.
Если же аннотация PrepareMyTest отсутствует - вернуть false.

Для вывода на экран классов из массива value используй сокращенное имя (getSimpleName).
*/

public class Solution {
    public static void main(String[] args) {
        printFullyQualifiedNames(Solution.class);
        printFullyQualifiedNames(SomeTest.class);

        printValues(Solution.class);
        printValues(SomeTest.class);
    }

    public static <T> boolean printFullyQualifiedNames(Class<T> c) {
        PrepareMyTest prepareMyTest = c.getDeclaredAnnotation(PrepareMyTest.class);
        if (prepareMyTest == null) {
//            System.out.println("1+1");
            return false;
        }
        for (String fullyQualifiedName : prepareMyTest.fullyQualifiedNames()) {
//            System.out.println("1");
            System.out.println(fullyQualifiedName);
        }
        return true;
    }

    public static <T> boolean printValues(Class<T> c) {
        PrepareMyTest prepareMyTest = c.getDeclaredAnnotation(PrepareMyTest.class);
        if (prepareMyTest == null) {
            return false;
        }
        for (Class<?> clazz : prepareMyTest.value()) {
//            System.out.println("2");
            System.out.println(clazz.getSimpleName());
        }
        return true;
    }
}
