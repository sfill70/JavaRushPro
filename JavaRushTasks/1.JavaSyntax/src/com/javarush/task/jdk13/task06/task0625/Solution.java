package com.javarush.task.jdk13.task06.task0625;

import java.util.Scanner;

/* 
Минимальная сумма
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            int tmpMin = 0;
            for (int j = 0; j < array[i].length; j++) {
                int tmp = console.nextInt();
                tmpMin = tmpMin + tmp;
                array[i][j] = tmp;
            }
            if (tmpMin < min) {
                min = tmpMin;
            }
        }

        for (int i = 0; i < array.length; i++) {
            int tmpMin = 0;
            for (int j = 0; j < array[i].length; j++) {
                tmpMin = tmpMin + (array[j][i]);
            }
            if (tmpMin < min) {
                min = tmpMin;
            }
        }

        System.out.println(min);
    }
}
