package com.javarush.task.jdk13.task28.task2815;

import java.util.Random;
import java.util.concurrent.*;

/* 
Пакуем лампочки
Разберись, что делает программа.
    Допиши метод simulatingProducers. Он должен добавлять в очередь QUEUE 5 миллионов лампочек.
    Для нумерации лампочек можешь воспользоваться генератором случайных чисел.

    В методе main три раза вызови метод runProcess передавая в него разные ExecutorService.
    Для создания ExecutorService воспользуйся методами newSingleThreadExecutor, newCachedThreadPool и
    newWorkStealingPool.



*/

public class Solution {

    private static final BlockingQueue<String> QUEUE = new LinkedBlockingQueue<>();

    public static void main(String[] args) {
        ExecutorService executeServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        ExecutorService executeServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        ExecutorService executeNewWorkStealingPool = Executors.newWorkStealingPool();
        runProcess(executeServiceNewSingleThreadExecutor);
        runProcess(executeServiceNewCachedThreadPool);
        runProcess(executeNewWorkStealingPool);
        //напишите тут ваш код

    }

    public static void runProcess(ExecutorService consumerService) {
        System.out.println("--------------------------------------");
        simulatingProducers();
        startConsumers(consumerService);
    }

    private static void simulatingProducers() {
        int maxProdBulbs = 5_000_000;
        Random rnd = new Random();
        System.out.println("Эмулируем работу производителей...");
        System.out.println("Производители произвели " + maxProdBulbs + " лампочек...");
        for (int i = 0; i < maxProdBulbs; i++) {
//            QUEUE.add("Bulbs" + rnd.nextInt(100));
//            QUEUE.offer("лампочка-" + rnd.nextInt(1000));
            QUEUE.add("лампочка-" + rnd.nextInt(1000));
        }
        //напишите тут ваш код

    }

    private static void startConsumers(ExecutorService consumerService) {
        System.out.println("Для упаковки используется: " + consumerService.getClass().getSimpleName());

        int queueSize = QUEUE.size();
        Consumer consumer = new Consumer();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < queueSize; i++) {
            consumerService.execute(consumer);
        }

        consumerService.shutdown();
        try {
            consumerService.awaitTermination(Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            System.out.println("Упаковщики упаковали все лампочки за " + (System.currentTimeMillis() - startTime) + " мс");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private static class Consumer implements Runnable {

        @Override
        public void run() {
            String bulb = QUEUE.poll();
//            if (bulb != null) {
//                System.out.println("Упакована: " + bulb + " упаковщиком: " + Thread.currentThread().getName());
//            }
        }
    }
}
