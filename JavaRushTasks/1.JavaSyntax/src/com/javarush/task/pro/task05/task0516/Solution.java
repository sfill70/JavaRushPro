package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[19];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        double l = array.length;
        Arrays.fill(array, 0, (int) Math.ceil(l / 2), valueStart);
        Arrays.fill(array, (int) Math.ceil(l / 2), array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
