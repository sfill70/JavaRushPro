package com.javarush.games.game2048;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] row = {0, 0, 2, 4};
        for (int i : row
        ) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println(compressRow(row));
        for (int i : row
        ) {
            System.out.print(i + ", ");
        }
        System.out.println();
        int[] row1 = {4, 4, 0, 0};
        System.out.println(compressRow(row1));
        for (int i : row1
        ) {
            System.out.print(i + ", ");
        }
        System.out.println();
        int[] row2 = {2, 0, 4, 0};
        System.out.println(compressRow(row2));
        for (int i : row2
        ) {
            System.out.print(i + ", ");
        }
        System.out.println();
        int[] row3 = {0, 2, 0, 4};
        System.out.println(compressRow(row3));
        for (int i : row3
        ) {
            System.out.print(i + ", ");
        }
        System.out.println();

    }

    private static boolean compressRow(int[] row) {
        boolean isSwap = false;
        for (int i = 0; i < row.length; i++) {
            if (row[i] == 0) {
                for (int j = i; j < row.length; j++) {
                    if (row[j] != 0) {
                        System.out.println(row[i] + " ," + row[j]);
                        swapRow(row, i, j);
//                        swap(row[i], row[j]);
                        isSwap = true;
                        break;
                    }
                }
            }
        }
        return isSwap;
    }

    private static void swapRow(int[] row, int i, int j) {
        int tmp = row[i];
        row[i] = row[j];
        row[j] = tmp;
    }

    private static void swap(int x, int y) {
        int tmp = x;
        x = y;
        y = tmp;
    }
}
