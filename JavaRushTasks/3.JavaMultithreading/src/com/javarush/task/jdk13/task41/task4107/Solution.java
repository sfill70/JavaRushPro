package com.javarush.task.jdk13.task41.task4107;

import com.javarush.task.jdk13.task41.task4107.factory.DotNetCourse;
import com.javarush.task.jdk13.task41.task4107.factory.JavaRush;
import com.javarush.task.jdk13.task41.task4107.factory.KotlinCourse;
import com.javarush.task.jdk13.task41.task4107.factory.ProgrammingCourse;

/* 
Кузница кадров
Отработай навык создания фабричных методов:

В пакете developers создай интерфейс Developer и приведи к нему все классы пакета.
В интерфейсе должны быть методы study и writeCode.
В корневой папке задачи создай пакет factory и в нем абстрактный класс ProgrammingCourse.
В классе добавь публичный абстрактный метод createDeveloper, возвращающий Developer
(это и будет твой фабричный метод).
Еще добавь публичный void метод educateStudent, который с помощью createDeveloper создает объект
Developer и вызывает у него метод study.
В пакете factory создай три класса: JavaRush, KotlinCourse и DotNetCourse.
Добавь им наследование от ProgrammingCourse. Реализуй в них фабричный метод, который должен
создавать и возвращать программиста соответствующего типа.
Раскомментируй код в классе Solution и проверь, все ли работает.
*/

import com.javarush.task.jdk13.task41.task4107.factory.DotNetCourse;
import com.javarush.task.jdk13.task41.task4107.factory.JavaRush;
import com.javarush.task.jdk13.task41.task4107.factory.KotlinCourse;
import com.javarush.task.jdk13.task41.task4107.factory.ProgrammingCourse;

public class Solution {

    private static ProgrammingCourse course;

    public static void main(String[] args) {
        choose("web");
        startLearningProcess();
    }

    static void choose(String direction) {
        if (direction.equals("web")) {
            course = new JavaRush();
        } else if (direction.equals("android")) {
            course = new KotlinCourse();
        } else {
            course = new DotNetCourse();
        }
    }

    static void startLearningProcess() {
        course.educateStudent();
    }
}
