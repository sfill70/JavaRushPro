package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ent = scanner.nextLine();
        int sum = 0;

        while (!ent.equalsIgnoreCase("ENTER")) {
            sum = sum + Integer.parseInt(ent);
            ent = scanner.nextLine();
        }
        System.out.println(sum);
        //напишите тут ваш код
    }
}