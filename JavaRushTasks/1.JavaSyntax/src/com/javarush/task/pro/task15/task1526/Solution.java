package com.javarush.task.pro.task15.task1526;

import java.io.*;
import java.util.Scanner;

/* 
task1526
*/

public class Solution {
    public static void main(String[] args) {
//        /home/sfillhp/Загрузки/7PPXH4KKSV/qwe.txt

        try (Scanner scanner = new Scanner(System.in);
             FileReader reader = new FileReader(scanner.nextLine());
                /*FileWriter writer = new FileWriter(System.out.print())*/) {
            while (reader.ready()) {
                char ch = (char) reader.read();
                if (ch != ' ' && ch != '.' && ch != ',') {
                    System.out.print(ch);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}