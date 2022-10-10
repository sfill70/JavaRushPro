package com.javarush.task.jdk13.task06.task0624;

import java.util.Scanner;

/* 
Максимальный элемент
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int tmp = console.nextInt();
                if (tmp > max) {
                    max = tmp;
                }
                array[i][j] = tmp;
            }
        }
        System.out.println(max);

        /*for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }*/
    }
}
