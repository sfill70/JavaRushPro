package com.javarush.task.jdk13.task35.task3501;

/* 
Вызов статического метода
Вызов статического метода
Измени статический метод в классе GenericStatic так, чтобы он стал дженериком.
Пример вызова дан в методе main.
*/

public class Solution {
    public static void main(String[] args) {
        GenericStatic.someStaticMethod("hello");
        GenericStatic.someStaticMethod(123);
        GenericStatic.someStaticMethod(321.123);
    }
}
