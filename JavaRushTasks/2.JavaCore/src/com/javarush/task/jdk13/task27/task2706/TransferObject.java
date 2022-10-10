package com.javarush.task.jdk13.task27.task2706;

public class TransferObject {
    private int value;
    protected volatile boolean isValuePresent = false; //use this variable

    /*public int get() {
        System.out.println("Got: " + value);
        return value;
    }

    public void put(int value) {
        this.value = value;
        System.out.println("Put: " + value);
    }*/

    public synchronized int get() {
        //System.out.println("Got before: " + value);
        while (!isValuePresent) {
            try {
                wait();
            } catch (InterruptedException ignore) {
            }
        }
        isValuePresent = false;
        System.out.println("Got: " + value);
        notify();
        return value;
    }

    public synchronized void put(int value) {
        //System.out.println("Put before: " + value);
        while (isValuePresent) {
            try {
                wait();
            } catch (InterruptedException ignore) {
            }
        }

        this.value = value;
        isValuePresent = true;
        System.out.println("Put: " + value);
        notify();
    }
}
