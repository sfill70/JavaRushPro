package com.javarush.task.jdk13.task28.task2809;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/* 
Многонитиевость в одной нити
Тебе нужно модифицировать программу, используя newSingleThreadExecutor вместо создания new Thread().
Для этого тебе нужно создать ExecutorService, использовать его метод submit(Callable) вместо new Thread(),
а в конце не забыть его остановить.
Requirements:
1. В классе Solution должно быть публичное статическое поле executorService инициализированное с помощью
метода newSingleThreadExecutor.
2. В методе startPlaying создание new Thread() должно быть заменено на вызов метода submit(Callable)
сервиса executorService.
3. Сервис executorService должен быть остановлен в конце метода main с помощью метода shutdown.
*/

public class Solution {
    public static ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static void main(String[] args) throws Exception {
        List<Future<String>> futures = new ArrayList<>();
        List<String> instruments = List.of("скрипка", "тромбон", "бубенцы", "контрабас");
        for (String instrument : instruments) {
            futures.add(startPlaying(instrument));
        }

        System.out.println("Успели доиграть: " + completeConcert(futures));

        executorService.shutdown();
    }

    public static Future<String> startPlaying(String name) {
        /*FutureTask<String> future = new FutureTask<>(new MusicalInstrument(name));
        executorService.submit(future);
        new Thread(future).start();
        return future;*/
        return executorService.submit(new MusicalInstrument(name));
    }

    public static List<String> completeConcert(List<Future<String>> futures) {
        List<String> result = new ArrayList<>();
        for (Future<String> future : futures) {
            try {
                result.add(future.get(800, TimeUnit.MILLISECONDS));
            } catch (Exception e) {
                future.cancel(true);
            }
        }
        return result;
    }
}