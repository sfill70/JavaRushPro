package com.javarush.task.jdk13.task06.task0627;

import java.util.Scanner;

/* 
Вот это переворот!
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
       Scanner console = new Scanner(System.in);

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=console.nextInt();
            }
        }

       /* for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }*/

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length; j++) {
                int tmp = array[j][i];
                array[j][i]=array[i][j];
                array[i][j] = tmp;
            }
        }

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
