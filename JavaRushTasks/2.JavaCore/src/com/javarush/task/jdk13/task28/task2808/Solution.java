package com.javarush.task.jdk13.task28.task2808;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* 
Мне допеть не успеть
Разберись, что делает программа. Попробуй запустить.

Реализуй метод completeConcert. Тебе нужно:

получить результат работы каждой задачи и добавить его в результирующий список строк;
при получении результата работы задач, сначала ожидать 800 миллисекунд, и потом, если задача не
вернула результат, прервать ее;
вернуть список с результатами работы задач, которые успели выполнится.
*/

public class Solution {



    public static void main(String[] args) throws Exception {
        List<FutureTask<String>> taskList = new ArrayList<>();
        List<String> instruments = List.of("скрипка", "тромбон", "бубенцы", "контрабас");
        for (String instrument : instruments) {
            taskList.add(startPlaying(instrument));
        }

        System.out.println("Успели доиграть: " + completeConcert(taskList));
    }

    public static FutureTask<String> startPlaying(String name) {
        FutureTask<String> task = new FutureTask<>(new MusicalInstrument(name));
        new Thread(task).start();
        return task;
    }

    public static List<String> completeConcert(List<FutureTask<String>> taskList) {
        List<String> result = new ArrayList<>();
        for (FutureTask<String> ft :
                taskList) {
            try {
                result.add(ft.get(800, TimeUnit.MILLISECONDS));
            } catch (Exception e) {
                ft.cancel(true);
            }
        }


        return result;
    }
}