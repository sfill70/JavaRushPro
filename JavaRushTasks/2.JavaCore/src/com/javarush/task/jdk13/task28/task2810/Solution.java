package com.javarush.task.jdk13.task28.task2810;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* 
Железобетонная остановка
 executorService.shutdown();
 Реализуй метод completeConcert. Тебе нужно:
инициировать остановку сервиса executor;
подождать 2 секунды;
проверить остановлен ли сервис executor;
если остановлен, то ничего не делать;
если не остановлен, то принудительно остановить его.
*/

public class Solution {

    public static ExecutorService executor = Executors.newSingleThreadExecutor();

    public static void main(String[] args) throws Exception {
        List<String> instruments = List.of("скрипка", "тромбон", "бубенцы", "контрабас");
        for (String instrument : instruments) {
            executor.submit(new MusicalInstrument(instrument));
        }

        completeConcert();
    }

    public static void completeConcert() throws Exception {
        executor.shutdown();
        Thread.sleep(2000);
        if (!executor.awaitTermination(2, TimeUnit.SECONDS)) {
            executor.shutdownNow();
        }
    }
}