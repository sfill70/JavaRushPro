package com.javarush.task.jdk13.task17.task1701;

import java.util.ArrayList;
import java.util.List;

/* 
Заметки
Асинхронность выполнения нитей.
1. Класс Note будет использоваться нитями.
2. Создай public static нить NoteThread (Runnable не является нитью), которая в методе
run 100 раз (index = 0-99) сделает следующие действия:
2.1. Используя метод addNote добавит заметку с именем [getName() + "-Note" + index], например, при index=4
"Thread-0-Note4"
2.2. Заснет на 1 миллисекунду
2.3. Используя метод removeNote удалит заметку
2.4. В качестве параметра в removeNote передай имя нити - метод getName()
Чтобы запустить программу, нужно раскомментировать строки в методе main().
*/

public class Solution {
    public static void main(String[] args) {
        new NoteThread().start();
        new NoteThread().start();
    }


    public static class NoteThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                Note.addNote(getName() + "-Note" + i);

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Note.removeNote(getName());
            }
        }
    }

    public static class Note extends Thread {

        public static final List<String> NOTES = new ArrayList<>();

        public static void addNote(String note) {
            NOTES.add(0, note);
        }

        public static void removeNote(String threadName) {
            String note = NOTES.remove(0);
            if (note == null) {
                System.out.println("Другая нить удалила нашу заметку");
            } else if (!note.startsWith(threadName)) {
                System.out.println("Нить [" + threadName + "] удалила чужую заметку [" + note + "]");
            } else {
                System.out.println("Нить [" + threadName + "] удалила свою заметку [" + note + "]");
            }
        }
    }
}
