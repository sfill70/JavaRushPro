package com.javarush.task.jdk13.task28.task2804;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {

    /*private static volatile AtomicInteger priority = new AtomicInteger(1);

    private synchronized void correctPriority() {
        int newPriority = priority.getAndIncrement();
        newPriority = getThreadGroup() != null && newPriority > getThreadGroup().getMaxPriority() ? getThreadGroup().getMaxPriority() : newPriority;
        setPriority(newPriority);
        if (priority.intValue() > MAX_PRIORITY) {
            priority.set(1);
        }
    }*/
    static int priority = 1;

    public MyThread() {
        this.setPriority(getThreadPriority());
    }

    public MyThread(Runnable target) {
        super(target);
        this.setPriority(getThreadPriority());
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
        this.setPriority(getThreadPriority());
    }

    public MyThread(String name) {
        super(name);
        this.setPriority(getThreadPriority());
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        this.setPriority(getThreadPriority());
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
        this.setPriority(getThreadPriority());
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        this.setPriority(getThreadPriority());
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
        this.setPriority(getThreadPriority());
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize, boolean inheritThreadLocals) {
        super(group, target, name, stackSize, inheritThreadLocals);
        this.setPriority(getThreadPriority());
    }


    private int getThreadPriority() {
        int priorityNow = priority;
        if (priority != 10) {
            priority++;
        } else {
            priority = 1;
        }
        if(this.getThreadGroup() != null){
            return Math.min(this.getThreadGroup().getMaxPriority(), priorityNow);
        }
        return priorityNow;
    }
}
