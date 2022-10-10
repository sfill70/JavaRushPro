package com.javarush.task.pro.task11.task1102;

/* 
Земля: техническая характеристика
*/

public class Planet {

    public String name;

    public long age;

    public int speed;

    public int area;

    public void printInformation() {
        System.out.println("Имя планеты: " + name + ".");
        System.out.println("Возраст: " + age + " лет.");
        System.out.println("Орбитальная скорость: " + speed + " км/ч.");
        System.out.println("Общая площадь: " + area + " кв. км.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
