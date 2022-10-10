package com.javarush.task.jdk13.task28.task2816;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* 
Рекурсивный алфавит

Разберись, что делает программа.

В методе call класса Task внеси изменения в строку вывода на экран, чтобы вывелась часть алфавита от
начала алфавита и до letter.

В методе call класса Task внеси изменения в строку с return, чтобы метод вернул часть алфавита от
начала алфавита и до letter.

Например: если у Task поле letter равняется 'к', то его метод call должен вывести в консоль и
вернуть строку "абвгдеёжзийк".
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        ExecutorService stealingPool = Executors.newWorkStealingPool();

        Future<String> future = stealingPool.submit(() -> {
            System.out.println("старт");
            Thread.sleep(100);
            return "";
        });

        for (char c : alphabet.toCharArray()) {
            future = stealingPool.submit(new Task(c, future));

        }

        stealingPool.awaitTermination(1, TimeUnit.SECONDS);
    }
}
