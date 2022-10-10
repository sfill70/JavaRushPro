package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int count = console.nextInt();
        if (count < 1) {
            return;
        }
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = console.nextInt();
        }
        if (count % 2 == 1) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        } else {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.println(array[i]);
            }
        }
    }
}
