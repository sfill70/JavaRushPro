package com.javarush.task.jdk13.task16.task1626;

/* 
А без interrupt слабо?
Разберись, как работает программа.
Реализуй метод ourInterruptMethod таким образом,
чтобы он прерывал нить TestThread. Исправь остальной код программы,
если это необходимо. Нельзя использовать метод interrupt.
*/

public class Solution {

    static boolean isRun;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        isRun = false;
    }

    public static class TestThread implements Runnable {
        public void run() {
            isRun = true;
            while (isRun) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException ignore) {
                }
            }
        }
    }
}
