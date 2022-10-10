package com.javarush.task.jdk13.task13.task1303;

/* 
Четыре ошибки
*/

public class Solution {

    public static void main(String[] args) {

       /* System.out.println(new Hobby().HOBBY.toString());*/
        System.out.println(new Hobby().toString());
        System.out.println(Dream.HOBBY.toString());

    }

    interface Desire {
    }

    interface Dream {
        public Hobby HOBBY = new Hobby();
    }

    static class Hobby  implements Desire, Dream {
        int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
