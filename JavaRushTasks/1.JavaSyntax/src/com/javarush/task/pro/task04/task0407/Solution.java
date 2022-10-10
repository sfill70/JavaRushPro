package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/

public class Solution {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        while (count < 100) {
            count++;
            if (count % 3 == 0) {
                continue;

            } else {
                sum = sum + count;
            }
        }
        System.out.println(sum);
        //напишите тут ваш код

    }
}