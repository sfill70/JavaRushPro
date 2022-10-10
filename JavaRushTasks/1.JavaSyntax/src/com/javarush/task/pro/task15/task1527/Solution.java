package com.javarush.task.pro.task15.task1527;

import java.io.*;
import java.util.Scanner;

/* 
task1527
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             FileReader input = new FileReader(scanner.nextLine());
             BufferedReader reader = new BufferedReader(input)) {
            int count = 0;
            while (reader.ready()) {
                String line = reader.readLine();
                if (count == 0) {
                    System.out.println(line);
                    count = 1;
                    continue;
                }
                count = 0;
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }

        //        /home/sfillhp/JavaRush.txt

        /*try (Scanner scanner = new Scanner(System.in);
             FileReader fileReader = new FileReader(scanner.nextLine());
             BufferedReader reader = new BufferedReader(fileReader)) {
            int counter = 0;
            while (reader.ready()) {
                String line = reader.readLine();
                if (counter % 2 == 0) {
                    System.out.println(line);
                }
                counter++;
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }*/

    }
}