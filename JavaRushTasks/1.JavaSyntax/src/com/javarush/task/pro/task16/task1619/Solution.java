package com.javarush.task.pro.task16.task1619;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* 
Простой шаблон
*/

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyyг. Hч.mмин");
//        DateTimeFormatter dtf1 = DateTimeFormatter.ofLocalizedDateTime();
        System.out.println(dtf.format(localDateTime));

//        19.03.2020г. 5ч.4мин

    }
}
