package com.javarush.task.pro.task15.task1538;

/* 
Использование Paths
*/

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {

    public static Path rpmLogPath;

    public static void main(String[] args) throws URISyntaxException {
        rpmLogPath = Paths.get(new URI("file:/usr/lib/rpm/rpm.log"));
        /*System.out.println(rpmLogPath);
        System.out.println(rpmLogPath.isAbsolute());*/

    }
}
