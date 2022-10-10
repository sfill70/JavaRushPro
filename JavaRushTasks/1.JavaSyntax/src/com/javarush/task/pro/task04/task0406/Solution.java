package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st;

        while (true) {
            st = scanner.nextLine();
            if (st.equalsIgnoreCase("enough")){
                break;
            }
            System.out.println(st);

        }
        //напишите тут ваш код

    }
}