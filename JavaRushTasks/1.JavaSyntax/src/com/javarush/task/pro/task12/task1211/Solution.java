package com.javarush.task.pro.task12.task1211;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Сортировка пузырьком
*/

public class Solution {

//    public static ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(56, 45, 89, 1, 45, 13, 4, 69, 11, -89));
    public static int[] numbers = new int[]{56, 45, 89, 1, 45, 13, 4, 69, 11, -89};

    public static void main(String[] args) {
        print();
        System.out.println();
//        print1();
        sort();
        System.out.println("\nОтсортированные числа в натуральном порядке:");
        print();
        System.out.println();
//        print1();
    }

    public static void sort() {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

       /* for (int i = 0; i < numbersList.size() - 1; i++) {
            for (int j = 0; j < numbersList.size() - i - 1; j++) {
                if (numbersList.get(j) > numbersList.get(j + 1)) {
                    int temp = numbersList.get(j);
                    numbersList.set(j, numbersList.get(j + 1));
                    numbersList.set(j + 1, temp);
                }
            }
        }*/
    }

    public static void print() {
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
    }

   /* public static void print1() {
        for (int number : numbersList) {
            System.out.print(number + "\t");
        }
    }*/
}
