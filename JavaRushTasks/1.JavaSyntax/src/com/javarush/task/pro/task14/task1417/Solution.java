package com.javarush.task.pro.task14.task1417;

/* 
Валидатор даты
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи дату в формате dd.mm.yyyy : ");
        String date = scanner.nextLine();
        validateDate(date);
        System.out.println("\nДата корректна.");
    }

    public static void validateDate(String date) {
        checkDateFormat(date);
        checkYearValue(date);
        checkMonthValue(date);
        checkDayValue(date);
    }

    public static void checkDateFormat(String date) {
        if (!date.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new InvalidDateFormatException();
        }

        /*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            LocalDate parsedDate = LocalDate.parse(date, formatter);
            System.out.println(parsedDate.format(formatter));
        } catch (Exception e) {
            throw new InvalidDateFormatException();
        }*/
    }

    public static void checkYearValue(String date) {
        String year = date.split("\\.")[2].trim();
        int intYear = Integer.parseInt(year);
        if (intYear < 1900 || intYear > 2100) {
            throw new InvalidYearValueException();
        }
    }

    public static void checkMonthValue(String date) {
        String month = date.split("\\.")[1].trim();
        int intMonth = Integer.parseInt(month);
        if (intMonth < 1 || intMonth > 12) {
            throw new InvalidMonthValueException();
        }
    }

    public static void checkDayValue(String date) {
        HashMap<Integer, Integer> months = new HashMap<>() {{
            put(1, 31);
            put(2, 29);
            put(3, 31);
            put(4, 30);
            put(5, 31);
            put(6, 30);
            put(7, 31);
            put(8, 31);
            put(9, 30);
            put(10, 31);
            put(11, 30);
            put(12, 31);
        }};
        String day = date.split("\\.")[0].trim();
        String month = date.split("\\.")[1].trim();
        int intMonth = Integer.parseInt(month);
        int intDay = Integer.parseInt(day);
        if (intDay < 1 || intDay > months.get(intMonth)) {
            throw new InvalidDayValueException();
        }
    }
}
