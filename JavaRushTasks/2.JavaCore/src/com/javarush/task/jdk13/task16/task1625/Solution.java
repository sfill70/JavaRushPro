package com.javarush.task.jdk13.task16.task1625;

/* 
Снова interrupt
Создай нить TestThread.
В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread testThread = new TestThread();
        testThread.start();
        Thread.sleep(5000);
        testThread.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends  Thread{
       /* @Override
        public void run() {
            while (true) {
                System.out.println("Bum");
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().isAlive());
                    System.out.println(Thread.currentThread().isInterrupted());
                    throw new RuntimeException(e);
                }
            }
        }*/
    }
}