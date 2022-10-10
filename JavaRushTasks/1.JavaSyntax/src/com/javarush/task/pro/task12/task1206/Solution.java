package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это буде1т новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int count = 0;
        for (char ch:string.toCharArray()
             ) {
            if(Character.isDigit(ch)){
                count++;
            }
        }
        return count;
    }

    public static int countLetters(String string) {
        int count = 0;
        for (char ch:string.toCharArray()
        ) {
            if(Character.isLetter(ch)){
                count++;
            }
        }
        return count;
    }

    /*public static int countSpaces(String string) {
        int countSpaces = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isSpaceChar(string.charAt(i))) {
                countSpaces++;
            }
        }
        return countSpaces;
    }*/

    public static int countSpaces(String string) {
        int count = 0;
        for (char ch:string.toCharArray()
        ) {
//            System.out.println((int)ch);
            if(Character.isSpaceChar(ch)){
                count++;
            }

        }
        return count;
    }
}
