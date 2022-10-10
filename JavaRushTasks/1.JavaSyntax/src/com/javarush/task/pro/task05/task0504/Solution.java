package com.javarush.task.pro.task05.task0504;

/* 
Объединяем массивы
*/

public class Solution {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        resultArray = new int[firstArray.length + secondArray.length];
        int lengthArray = Math.max(firstArray.length, secondArray.length);
        for (int i = 0; i < lengthArray; i++) {
            if (i < firstArray.length) {
                resultArray[i] = firstArray[i];
            }
            if (i < secondArray.length) {
                resultArray[i + firstArray.length] = secondArray[i];
            }
        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}
