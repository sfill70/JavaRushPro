package com.javarush.task.pro.task15.task1514;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Все относительно
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        Path path1 = Path.of(str1);
        Path path2 = Path.of(str2);
        try {
            Path path = path1.relativize(path2);
            System.out.println(path);
        } catch (Exception e) {

        }

       /* Path path1 = Path.of("/home/sfillhp/IdeaProjects/JavaRushTasks/1/");
        Path path2 = Path.of("/home/sfillhp/");
        Path result = path2.relativize(path1);

        Path result2 = path1.relativize(path2);
        System.out.println(result);
        System.out.println(result2);*/
    }
}

