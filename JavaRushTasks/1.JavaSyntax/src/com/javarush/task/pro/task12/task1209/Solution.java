package com.javarush.task.pro.task12.task1209;

import java.util.ArrayList;

/* 
Бухгалтерия
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
        System.out.println(waitingEmployees);
        paySalary("Боргелейф");
        System.out.println(waitingEmployees);
        System.out.println(alreadyGotSalaryEmployees);
        paySalary("Боргелейф");
        System.out.println(waitingEmployees);
        System.out.println(alreadyGotSalaryEmployees);
        paySalary("Альбиуф");
        System.out.println(waitingEmployees);
        System.out.println(alreadyGotSalaryEmployees);
    }

    public static void paySalary(String name) {
        if (name == null) {
            return;
        }
        if (waitingEmployees.contains(name)) {
            for (int i = 0; i < waitingEmployees.size(); i++) {
                if (name.equals(waitingEmployees.get(i))) {
                    alreadyGotSalaryEmployees.add(name);
                    waitingEmployees.set(i, null);
                    break;
                }
            }
        }
    }
}
