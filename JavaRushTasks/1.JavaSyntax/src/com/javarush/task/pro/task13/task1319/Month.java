package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        Month[] array = {DECEMBER, JANUARY, FEBRUARY};
        return array;
    }

    public static Month[] getSpringMonths() {
        return new Month[]{MARCH, APRIL, MAY};
    }

    public static Month[] getSummerMonths() {
        Month[] array = {JUNE, JULY, AUGUST};
        return array;
    }

    public static Month[] getAutumnMonths() {
        return new Month[]{SEPTEMBER, OCTOBER, NOVEMBER};
            }

}
