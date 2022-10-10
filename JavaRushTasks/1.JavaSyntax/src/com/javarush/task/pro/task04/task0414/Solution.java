package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int num = scanner.nextInt();
        do {
            if (num < 5 && num > 0) {
                System.out.println(word);
                num--;
            } else {
                System.out.println(word);
                num = 0;
            }
        } while (num > 0);
    }
}