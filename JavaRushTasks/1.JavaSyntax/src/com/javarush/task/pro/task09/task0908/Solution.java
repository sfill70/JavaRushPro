package com.javarush.task.pro.task09.task0908;

/*
Двоично-шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";
    private static final String[] BINARY = {"0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"};

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
//        com.javarush.task.pro.task09.task0906.Solution.toBinary()
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null){
            return "";
        }
        if (!binaryNumber.matches(".[^12]")) {
            return "";
        }
        int decimalNumber = toDecimalForBinary(binaryNumber);
        return toHex(decimalNumber);
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber == null || hexNumber.isBlank() || hexNumber.isEmpty()) {
            return "";
        }
        if (!hexNumber.matches("[^0123456789abcdef]")) {
            return "";
        }
        int decimalNumber = toDecimal(hexNumber);
        return toBinary(decimalNumber);
    }

    public static String toHex(int decimalNumber) {
        if (decimalNumber <= 0) {
            return "";
        }
        String hexNumber = "";
        while (decimalNumber != 0) {
//            String tmp = String.valueOf(HEX.charAt(decimalNumber % 16));
            hexNumber = String.valueOf(HEX.charAt(decimalNumber % 16)) + hexNumber;
            decimalNumber = decimalNumber / 16;
        }
        return hexNumber;
    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber == null || hexNumber.isBlank() || hexNumber.isEmpty()) {
            return 0;
        }
        int decimalNumber = 0;
        for (int i = hexNumber.length() - 1; i >= 0; i--) {
            int index = HEX.indexOf(hexNumber.charAt(hexNumber.length() - 1 - i));
            decimalNumber = 16* decimalNumber + index;

        }

//        решение JavaRash
       /* for (int i = 0; i < hexNumber.length(); i++) {
            decimalNumber = 16 * decimalNumber + HEX.indexOf(hexNumber.charAt(i));
        }*/
        return decimalNumber;
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber <= 0) {
            return "";
        }
        int i = 0;
        String binaryNumber = "";
        while (decimalNumber != 0) {
//            binaryNumber.insert(0, decimalNumber % 2);
            binaryNumber = decimalNumber % 2 + binaryNumber;
            decimalNumber = decimalNumber / 2;
        }
        return binaryNumber;
    }

    public static int toDecimalForBinary(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isBlank() || binaryNumber.isEmpty()) {
            return 0;
        }
        int decimalNumber = 0;
        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            if (binaryNumber.charAt(i) == '1') {
                decimalNumber = decimalNumber + (int) Math.pow(2, binaryNumber.length() - 1 - i);
            }
        }

//        решение JavaRash
        /*for (int i = 0; i < binaryNumber.length(); i++) {
            int index = binaryNumber.length() - 1 - i;
            int value = Character.getNumericValue(binaryNumber.charAt(index));
            decimalNumber += value * Math.pow(2, i);
        }*/
        return decimalNumber;
    }


}
