package com.javarush.task.jdk13.task06.task0626;

import java.util.Scanner;

/* 
Первая база данных
*/

public class Solution {
    public static String[][] array = new String[][]{{"123", "Иванов", "Богдан"},
            {"1425", "Петрова", "Марина"},
            {"37", "Богдан", "Андрей"},
            {"98", "Богданова", "Марина"},
            {"6285", "Прутко", "Сергей"},
            {"8", "Клочкова", "Елена"},
            {"754", "Котов", "Иван"}};

    public static void main(String[] args) {

//        Я делал более универсальное решение

        Scanner console = new Scanner(System.in);
        String target = console.nextLine();
        Boolean isPrint = false;

        for (int i = 0; i < array.length; i++) {
            isPrint = false;
            for (int j = 0; j < array[i].length; j++) {
                if (target.equals(array[i][j])) {
                    isPrint = true;
                }
            }
            if (isPrint) {
                StringBuilder result = new StringBuilder();
                for (int j = 0; j < array[i].length; j++) {
                    result.append(array[i][j]).append(" ");
                }
                System.out.print(result.toString().trim());
            }
            if (isPrint) {
                System.out.println();
            }
        }

//        решение JavaRash;
        /*Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int i = 0; i < array.length; i++) {
            if (array[i][0].equals(input) || array[i][1].equals(input) || array[i][2].equals(input)) {
                System.out.println(array[i][0] + " " + array[i][1] + " " + array[i][2]);
            }
        }*/

    }
}
