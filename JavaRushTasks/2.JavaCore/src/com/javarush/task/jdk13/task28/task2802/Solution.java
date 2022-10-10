package com.javarush.task.jdk13.task28.task2802;

import java.util.concurrent.ThreadLocalRandom;

/* 
ThreadLocalRandom

Класс Solution будет использоваться трэдами.
Реализуй логику всех методов, используй класс ThreadLocalRandom.
getRandomIntegerBetweenNumbers должен возвращать случайный int между from и to.
getRandomDouble должен возвращать случайный double.
getRandomLongBetween0AndN должен возвращать случайный long между 0 и n.
*/

public class Solution {
    public static int getRandomIntegerBetweenNumbers(int from, int to) {
        return ThreadLocalRandom.current().nextInt(from, to);
    }

    public static double getRandomDouble() {
        return ThreadLocalRandom.current().nextDouble();
    }

    public static long getRandomLongBetween0AndN(long n) {

        return ThreadLocalRandom.current().nextLong(n);
    }

    public static void main(String[] args) {
        System.out.println(getRandomIntegerBetweenNumbers(100,300));
        System.out.println(getRandomDouble());
        System.out.println(getRandomLongBetween0AndN(700));
    }
}
