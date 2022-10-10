package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (c >= a + b) {
            System.out.println(TRIANGLE_NOT_EXISTS);
            return;
        } else if (b >= a + c) {
            System.out.println(TRIANGLE_NOT_EXISTS);;
            return;
        } else if (a >= c + b) {
            System.out.println(TRIANGLE_NOT_EXISTS);
            return;
        }
        System.out.println(TRIANGLE_EXISTS);
        //напишите тут ваш код
    }
}
