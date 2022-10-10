package com.javarush.task.jdk13.task41.task4101;

import java.util.HashSet;
import java.util.Set;

/* 
Микроскопом по гвоздям
Разберись, что делает программа. Как видишь, при создании второго рабочего возникает ошибка компиляции.

Нужно решить эту проблему, не изменяя классы Hammer, Nail, HardWorker, Microscope.
Для этого создай новый класс MicroscopeAdapter, унаследованный от Hammer. Добавь ему поле microscope типа Microscope, инициализируй его в конструкторе. Переопредели метод hit, чтобы он вызывал у микроскопа метод bang и всегда возвращал false.
В методе main оберни микроскоп, передаваемый второму рабочему, в получившийся адаптер. Больше ничего не меняй.

Адаптер вышел простенький, подумай, как его можно усовершенствовать.
*/

public class Solution {

    public static void main(String[] args) {
        HardWorker worker1 = new HardWorker("Bob", getNailsPack(), new Hammer());
        HardWorker worker2 = new HardWorker("Bob Jr.", getNailsPack(), new MicroscopeAdapter(new Microscope()));



        worker1.hammerAllNails();
        worker2.hammerAllNails();
    }

    public static Set<Nail> getNailsPack() {
        Set<Nail> nailPack = new HashSet<>();
        for (int i = 0; i < 200; i++) {
            nailPack.add(new Nail());
        }
        return nailPack;
    }
}
