package com.javarush.task.jdk13.task15.task1508;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();

    static {
        labels.put(1.3,"qwe");
        labels.put(1.4,"qwet");
        labels.put(1.5,"qwety");
        labels.put(1.6,"qwetyu");
        labels.put(1.7,"qweuio");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
