package com.javarush.task.jdk13.task41.task4123;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

/* 
Доверяй, но перепроверяй
На примере этой абстрактной задачи ты закрепишь Блокировку с двойной проверкой. Разберись, что происходит в
программе.
Как видишь, метод initDB уже синхронизирован, и если запустить программу, то все нити отработают
правильно и вернут значение 100.

Но сейчас каждый раз при обращении к методу initDB происходит синхронизация, хотя реально она нужна только
при первом обращении к методу. Исправь это:

убери у метода synchronized;
весь код в if оберни в synchronized (this) {} блок;
весь код внутри synchronized блока оберни в еще один if (isNull(users)) {}.
Но если теперь запустить программу, только один поток возвращает 100.
После того, как первый поток выполняет строку users = new HashMap<>();, остальные потоки не заходят в
блок synchronized, а получают не полностью заполненную мапу users.
Попробуй исправить это, добавив полю users модификатор volatile.

Запусти программу — volatile не помогло :)

В методе initDB внутри второго if-a создай локальную переменную Map<Integer, User>, и в цикле заполняй ее,
а не users. После цикла присвой users значение этой локальной переменной.

Теперь должно работать правильно ;)
*/

public class Solution {

    public static UserDB db = new UserDB();

    public static void main(String[] args) throws Exception {
        Set<Callable<Integer>> callables = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            callables.add(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    TimeUnit.MILLISECONDS.sleep(finalI);
                    return db.getDB().size();
                }
            });
        }

        ExecutorService executor = Executors.newCachedThreadPool();
        List<Future<Integer>> futures = executor.invokeAll(callables);
        executor.awaitTermination(1, TimeUnit.SECONDS);
        for (Future<Integer> future : futures) {
            System.out.println(future.get());
        }

        executor.shutdown();
    }
}
