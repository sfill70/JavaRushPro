package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("asd",4.4);
        grades.put("qwe",4.4);
        grades.put("qaz",4.4);
        grades.put("xsw",4.4);
        grades.put("cvb",4.4);
    }
}
