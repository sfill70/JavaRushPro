package com.javarush.task.jdk13.task23.task2304;

/* 
Напряги извилины!
Метод printName должен выводить имя собственного объекта, т.е. "The Darkside Hacker"
Сделайте минимум изменений.
*/

public class Solution {
    private String name;

    Solution(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    private void sout() {
        new Solution("The Darkside Hacker") {
            void printName() {
                System.out.println(getName());
            }
        }.printName();
    }

    public static void main(String[] args) {
        new Solution("Риша").sout();
    }
}
