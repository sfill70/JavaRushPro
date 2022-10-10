package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        /*int firstIndex = path.indexOf("jdk");
        int lastIndex = path.indexOf("/", firstIndex);
        String oldJdk = path.substring(firstIndex, lastIndex);

        return path.replace(oldJdk, jdk);*/
//        String convert = path.replace("jdk1.8", jdk);
        /*String convert = path.replaceAll("jdk"+"[0-9]{1,2}"+"\\."+"[0-9]{0,2}", jdk);
        return convert;*/
        String[] array = path.split("/");
        for (int i = 0; i < array.length; i++) {
            if (array[i].indexOf("jdk") >= 0) {
                array[i] = jdk;
            }
            array[i] = "/" + array[i].trim();
        }
        array[array.length - 1] = array[array.length - 1] + "/";
        String joinedString = Arrays
                .stream(array)
                .collect(Collectors.joining());
//        String joinedString = String.join("/",array);
//        return Arrays.toString(array);
        return joinedString.substring(1, joinedString.length());
    }
}
