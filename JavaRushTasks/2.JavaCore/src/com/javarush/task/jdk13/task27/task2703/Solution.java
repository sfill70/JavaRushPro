package com.javarush.task.jdk13.task27.task2703;

/* 
Второй вариант deadlock
В методе secondMethod расставь synchronized блоки так,
 чтобы при использовании класса Solution нитями образовывался deadlock.
*/

public class Solution {
    private final Object lock = new Object();

    public synchronized void firstMethod() {
        synchronized (lock) {
            doSomething();
        }
    }

    public void secondMethod() {
        synchronized (lock) {
            synchronized (this) {
                doSomething();
            }
        }
    }

    private void doSomething() {
    }

    public static void main(String[] args) {

    }
}
