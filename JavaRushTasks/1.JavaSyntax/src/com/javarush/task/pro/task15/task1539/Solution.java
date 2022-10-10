package com.javarush.task.pro.task15.task1539;

/* 
Использование Paths 2
*/

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(joinToPath(Arrays.asList("d:/", "study/", "javarush/", "полезные куски кода.txt")));
    }

    public static Path joinToPath(List<String> partsList) {
        String[] partsArray = new String[partsList.size() - 1];
        System.arraycopy(partsList.toArray(), 1, partsArray, 0, partsArray.length);
//        System.out.println(Arrays.toString(partsArray));
        return Paths.get(partsList.get(0), partsArray);
    }
}
