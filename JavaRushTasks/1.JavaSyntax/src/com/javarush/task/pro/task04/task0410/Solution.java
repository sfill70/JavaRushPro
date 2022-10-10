package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int min = console.nextInt();
        int secondMin = console.nextInt();
        if (secondMin < min) {
            int tmp = min;
            min = secondMin;
            secondMin = tmp;
        }
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if(min == secondMin) {
                if(x < min) {
                    min = x;
                } else {
                    secondMin = x;
                }
            } else if (x < min) {
                secondMin = min;
                min = x;
            } else if (x > min && x < secondMin) {
                secondMin = x;
            }
        }
        System.out.println(secondMin);



       /* int min = console.nextInt();
        int tooMin = Integer.MAX_VALUE;
        int tmp;
        tmp = console.nextInt();
        if (tmp < min) {
            tooMin = min;
            min = tmp;
        } else {
            if (tmp != min) {
                tooMin = tmp;
            }
        }

        while (console.hasNextInt()) {
            tmp = console.nextInt();
            if (tmp < min) {
                tooMin = min;
                min = tmp;
            } else {
                if (tmp < tooMin && tmp != min) {
                    tooMin = tmp;
                }
            }
        }
        System.out.println(tooMin);*/


    }
}
