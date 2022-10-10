package com.javarush.task.pro.task16.task1604;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1970,00,5);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        Date date = calendar.getTime();
        Locale locale = new Locale("ru");
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE", /*locale*/ Locale.forLanguageTag("ru"));
        String newData = dateFormat.format(date);
        return newData;
    }
}
