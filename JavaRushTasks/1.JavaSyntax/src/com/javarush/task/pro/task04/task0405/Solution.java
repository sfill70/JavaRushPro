package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int y = 10;
        int x = 20;
        while (y > 0) {
            while (x > 0) {
                if (y == 1 || y == 10) {
                    System.out.print("Б");
                }
                else {
                    if(x==1||x==20){
                        System.out.print("Б");
                    }
                    else {System.out.print(" ");}
                }
                x--;
            }
            System.out.println();
            x = 20;
            y--;
        }
        //напишите тут ваш код

    }
}