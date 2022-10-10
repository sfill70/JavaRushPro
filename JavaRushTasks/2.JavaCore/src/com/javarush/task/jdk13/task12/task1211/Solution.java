package com.javarush.task.jdk13.task12.task1211;

/* 
Int и Integer
*/

public class Solution {
    public static void main(String[] args) {

        print(20);

        Integer x = new Integer(40);
        print(x);
    }

    public static void print(int x) {
        System.out.println(x);
    }
    public static void print(Integer x){
        System.out.println(x);
    }
}
