package com.javarush.task.jdk13.task41.task4108;

import com.javarush.task.jdk13.task41.task4108.factories.JavaRush;

/* 
Фабрики кадров
 Abstract factory
Дано: разработчики разного уровня на разных языках программирования.

Сформируй фабрики для их производства:

Создай:
пакет juniors и в нем интерфейс JuniorDeveloper с void методом fixBugs;
пакет middles и в нем интерфейс MiddleDeveloper с void методом writeNewModule;
пакет seniors и в нем интерфейс SeniorDeveloper с void методом designArchitecture;
Перемести классы джуниоров в пакет juniors, мидлов — в middles, синьоров — в seniors.
Добавь всем классам реализацию соответствующих интерфейсов.
Создай пакет factories и в нем интерфейс DeveloperCourse (это будет наша абстрактная фабрика)
с фабричными методами:
JuniorDeveloper createJunior();
MiddleDeveloper createMiddle();
SeniorDeveloper createSenior().
В пакете factories создай классы конкретных фабрик: JavaScriptCourse, PythonCourse, JavaRush.
Реализуй в них интерфейс абстрактной фабрики: методы должны возвращать объекты соответствующих разработчиков.
Раскомментируй код в классах Team и Solution — все должно работать.
P. S. текст в классах разработчиков сгенерирован ИИ. Любые совпадения случайны.
*/



public class Solution {

    public static void main(String[] args) {
        Team javaTeam = new Team(new JavaRush());
        javaTeam.hireSeniors(1);
        javaTeam.hireMiddles(3);
        javaTeam.hireJuniors(8);
        javaTeam.produceCode();
    }
}
