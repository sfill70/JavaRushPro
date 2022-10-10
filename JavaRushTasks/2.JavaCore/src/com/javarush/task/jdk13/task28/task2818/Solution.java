package com.javarush.task.jdk13.task28.task2818;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* 
С ScheduledExecutor по галактике
В методе main передай в scheduledPool задание TheUltimateQuestion.
Задание должно выполнится один раз через семь с половиной миллионов лет после запуска.
Метод main должен вывести на экран результат выполнения задания.
Нужно использовать TimeUnit.DAYS. Считаем, что в году 365 дней.

*/

public class Solution {

    public static ScheduledExecutorService scheduledPool = Executors.newScheduledThreadPool(3);

    public static void main(String[] args) throws Exception {
        /*ScheduledFuture<Integer>
        schedule =  scheduledPool.schedule(new TheUltimateQuestion(), 1, TimeUnit.SECONDS);
        System.out.println(schedule.get());*/
        System.out.println(scheduledPool.schedule(new TheUltimateQuestion(),
                365L * 7_500_000, TimeUnit.DAYS).get());
        //напишите тут ваш код


        scheduledPool.shutdown();
    }
}
