package com.javarush.task.jdk13.task17.task1707;

/* 
МВФ
Singleton паттерн - синхронизация в методе.
Класс IMF - это Международный Валютный Фонд.
Внутри метода getFund создай синхронизированный блок.
Внутри синхронизированного блока инициализируй поле imf
так, чтобы метод getFund всегда возвращал один и тот же объект.
*/

public class Solution {
    public static void main(String[] args) {
        IMF fund = IMF.getFund();
        IMF anotherFund = IMF.getFund();
        System.out.println(fund == anotherFund);
    }
}
