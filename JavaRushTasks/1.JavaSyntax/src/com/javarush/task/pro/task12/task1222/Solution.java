package com.javarush.task.pro.task12.task1222;

import java.util.ArrayList;

/* 
Выводим в консоли разные типы
*/

public class Solution {

    public static void printAnything(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static void main(String[] args) {
        var arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add("Hello");
        arrayList.add(154);
        arrayList.add("string");
//        System.out.println(arrayList.remove(2));
//        System.out.println(arrayList.get(0));

        printAnything(arrayList);
    }
}
