package com.javarush.task.pro.task16.task1601;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date(70,00,4);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

//    "MMM-dd-YYYY"

    static String getDayOfWeek(Date date) {
        Locale locale = new Locale("ru");
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE", /*locale*/ Locale.forLanguageTag("ru"));
        String newData = dateFormat.format(date);
        return newData;


//        JavaRash
        /*    String result = "";
        int day = date.getDay();
        switch (day) {
            case 0:
                return "воскресенье";
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
        }
        return result;*/



    }
}
