package com.javarush.task.pro.task13.task1307;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

/* 
Изучаем методы класса Collections, часть 2
*/

public class Solution {

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }

    public static void rotate(ArrayList<Integer> list, int distance) {
       /* for (int i = 0; i < distance; i++) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }*/
        Collections.rotate(list, distance);
    }

    public static void shuffle(ArrayList<Integer> list) {
        /*Random rand = new Random();
        for (int i = 0; i < list.size(); i++) {
            int randomIndexToSwap = rand.nextInt(list.size());
            int temp = list.get(randomIndexToSwap);
            list.set(randomIndexToSwap, list.get(i));
            list.set(i, temp);
        }*/
        Collections.shuffle(list);
    }
}
