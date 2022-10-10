package com.javarush.task.jdk13.task28.task2811;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* 
Знакомство с Executors
В методе main создай фиксированный пул из 5 трэдов используя класс Executors.
В цикле отправь на исполнение в пул 20 задач Runnable.
У каждой задачи в методе run вызови метод doExpensiveOperation с порядковым номером задачи начиная с 1.
Запрети добавление новых задач на исполнение в пул (метод shutdown).
Дай пулу 5 секунд на завершение всех задач (метод awaitTermination и параметр TimeUnit.SECONDS).
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 1; i < 21; i++) {
           int finalI = i;
             /*executor.submit(new Runnable() {
                @Override
                public void run() {
                    doExpensiveOperation(finalI);
                }
            });*/
            executor.submit(() -> doExpensiveOperation(finalI));
        }

        executor.shutdown();
        executor.awaitTermination(5,TimeUnit.SECONDS);

    }

    private static void doExpensiveOperation(int localID) {
        System.out.println(Thread.currentThread().getName() + ", localID=" + localID);
    }
}
