package com.javarush.task.pro.task10.task1006;

/* 
Кто тут наследник?
*/

public class Solution {
    public static void main(String[] args) {
        Car car = new ElectricCar();
        Car car1 = new HybridCar();
        Car car2 = new GasCar();
    }
}
