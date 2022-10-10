package com.javarush.task.pro.task16.task1611;

import java.time.LocalTime;

/* 
Нужно просто посчитать
*/

public class Solution {

//    static LocalTime local = LocalTime.MIDNIGHT;
    public static void main(String[] args) throws InterruptedException {
        LocalTime localTime = LocalTime.MIDNIGHT;
//        System.out.println(localTime);
        LocalTime next = amazingMethod(localTime);
        while (next.isAfter(localTime)) {
            System.out.println(next);
            next = amazingMethod(next);
            Thread.sleep(500);
        }
    }

    static LocalTime amazingMethod(LocalTime base) {
        base = base.minusMinutes(288);
//        System.out.println(base);
//        System.out.println(base.isAfter(local));
        return base;
    }
}
