package com.javarush.task.jdk13.task28.task2806;

import java.util.*;
import java.util.concurrent.FutureTask;

/* 
Параллельный парсинг
Преобразуй программу, воспользовавшись интерфейсом Callable вместо Runnable:
в классе ParseLinkTask замени интерфейс Runnable на Callable<Link>;
метод run переименуй в call;
удали поле link и его геттер, а вместо него в методе call создай, заполни и верни
локальную переменную типа Link.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            lines.add(scanner.nextLine());
        }

        Map<Thread, ParseLinkTask> tasks = new HashMap<>();
        for (String line : lines) {
            ParseLinkTask parseLinkTask = new ParseLinkTask(line);
            FutureTask<Link> future = new FutureTask<>(parseLinkTask);
            Thread thread = new Thread(future);
            tasks.put(thread, parseLinkTask);
            thread.start();
        }

        for (Map.Entry<Thread, ParseLinkTask> entry : tasks.entrySet()) {
            entry.getKey().join();
            System.out.println(entry.getValue().toString());
        }
    }
}