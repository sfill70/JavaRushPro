package com.javarush.task.jdk13.task28.task2813;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* 
Кеширование нитей
В методе main инициализируй поле executorService с помощью метода newCachedThreadPool.
Реализуй методы submitProducers и submitConsumers. В методе submitProducers добавь в
сервис executorService сто заданий Producer.
Во все конструкторы Producer передай разные строки.
В методе submitConsumers добавь в сервис executorService сто заданий Consumer.
Так как у Consumer нет состояния (нет полей), используй один объект Consumer 100 раз.
*/

public class Solution {

    public static BlockingQueue<String> queue = new ArrayBlockingQueue<>(32);
    public static ExecutorService executorService;

    public static void main(String[] args) throws Exception {
        executorService = Executors.newCachedThreadPool();

        submitProducers();
        submitConsumers();

        executorService.shutdownNow();
    }

    public static void submitProducers() {
        for (int i = 0; i < 100; i++) {
            executorService.submit(new Producer("Producer - " + i));
        }

    }

    public static void submitConsumers() {
        Consumer consumer = new Consumer();
        for (int i = 0; i < 100; i++) {
            executorService.submit(consumer);
        }

    }
}
