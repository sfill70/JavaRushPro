package com.javarush.task.jdk13.task06.task0632;


import java.io.IOException;
import java.util.Scanner;

/* 
Пирамида
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        int height = console.nextInt();
        array = new char[height][height * 2 - 1];

        //Решение JavaRash
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (j < array.length - i - 1 || j > array[0].length - array.length + i) {
                    array[i][j] = ' ';
                } else {
                    array[i][j] = '#';
                }
            }
        }

      /*  int widthOfLayer = height - 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j < widthOfLayer || j >= array[i].length - widthOfLayer) {
                    array[i][j] = ' ';
                } else {
                    array[i][j] = '#';
                }
            }
            widthOfLayer--;
        }*/

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }
}
