package com.javarush.task.pro.task15.task1528;

import java.io.*;
import java.util.Scanner;

/* 
task1528
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             FileOutputStream fos = new FileOutputStream(scanner.nextLine());
             /*Writer writer = new FileWriter(scanner.nextLine())*/) {
            byte[] bytes = new byte[]{106, 97, 118, 97};
            fos.write(bytes);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}