package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {

        int y = 5;
        int x = 10;
        while (y > 0) {
            while (x > 0) {
                System.out.print("Q");
                x--;
            }
            System.out.println();
            x = 10;
            y--;
        }

        //напишите тут ваш код

    }
}