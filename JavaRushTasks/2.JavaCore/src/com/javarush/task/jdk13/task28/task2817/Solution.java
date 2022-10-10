package com.javarush.task.jdk13.task28.task2817;

import java.time.LocalTime;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* 
Полусекундомер
В методе main выбери и выполни нужный метод у scheduledPool, чтобы он начал выводить на экран LocalTime.now().

Начальная задержка отсутствует. Интервал от начала одного запуска до начала следующего — полсекунды.

Пример вывода:

08:12:27.557273100
08:12:28.048495200
08:12:28.552839300
08:12:29.046988900
08:12:29.553360
08:12:30.059767300

*/

public class Solution {

    public static ScheduledExecutorService scheduledPool = Executors.newScheduledThreadPool(3);

    public static void main(String[] args) throws Exception {
        scheduledPool.scheduleAtFixedRate(() -> System.out.println(LocalTime.now()), 0, 500, TimeUnit.MILLISECONDS);
       /* scheduledPool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println(LocalTime.now());
            }
        }, 0, 500, TimeUnit.MILLISECONDS);*/
        //напишите тут ваш код


        Thread.sleep(3000);
        scheduledPool.shutdown();
    }
}
