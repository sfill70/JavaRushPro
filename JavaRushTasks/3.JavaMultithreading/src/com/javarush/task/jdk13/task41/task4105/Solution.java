package com.javarush.task.jdk13.task41.task4105;

import com.javarush.task.jdk13.task41.task4105.alchemy_library.*;
import com.javarush.task.jdk13.task41.task4105.facade.PotionConversionFacade;

import static com.javarush.task.jdk13.task41.task4105.alchemy_library.Type.MANA;
import static com.javarush.task.jdk13.task41.task4105.alchemy_library.Type.STAMINA;

/* 
Алхимическая библиотека
Паттерн Facade
Дано: пакет alchemy_library содержит библиотеку, которая эмулирует превращение одного зелья в другое
того же размера.
Метод main содержит клиентский код, и он немного запутан. Тебе нужно создать фасад с более простым интерфейсом.

В корневой папке задачи создай пакет facade и в нем — класс PotionConversionFacade.
Внутри создай метод public String convertPotion(String potionName, String convertTo).
Он должен принимать название исходного зелья и тип зелья, которое нужно получить,
а возвращать — название полученного нового зелья.
Перенеси весь клиентский код из main в convertPotion. В выводе в консоль замени
"Client Code:" на "PotionConversionFacade:".

Что должно остаться в main:

создание объекта фасада;
вызов convertPotion с полями potionName и type в качестве параметров;
вывод на экран результата convertPotion.

*/

public class Solution {



    public static String potionName = "Minor Healing Potion";
    public static String type = "stamina";


    public static void main(String[] args) {
        PotionConversionFacade facade = new PotionConversionFacade();
        System.out.println(facade.convertPotion(potionName, type));
    }

/*    public static void main(String[] args) {
        System.out.println("Client Code: conversion started.");
        Potion potion = new Potion(potionName);
        Type type = Type.valueOf(Solution.type.toUpperCase());
        Essence sourceEssence = EssenceFactory.extract(potion);
        Essence destinationEssence;
        if (type == MANA) {
            destinationEssence = new ManaEssenceConverter();
        } else if (type == STAMINA) {
            destinationEssence = new StaminaEssenceConverter();
        } else {
            destinationEssence = new HealingEssenceConverter();
        }
        Potion portion = Extractor.extractPortion(potion, sourceEssence);
        Potion intermediateResult = Extractor.convert(portion, destinationEssence);
        Potion result = new Finalizator().fix(intermediateResult);
        System.out.println("Client Code: conversion completed.");

        System.out.println(result.getName());
    }*/
}
