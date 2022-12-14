package com.javarush.task.jdk13.task20.task2008;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

/* 
Сериализация зоопарка
НЕОБХОДИМО: подключенные библиотеки jackson-databind и jackson-dataformat-yaml версии 2.13.1.

Сделай так, чтобы при сериализации объекта типа Zoo каждому элементу списка animals был добавлен тип
(lion для класса Lion, penguin для класса Penguin).
*/

public class Solution {
    public static void main(String[] args) throws JsonProcessingException {
        Zoo zoo = new Zoo();
        zoo.animals.add(new Zoo.Lion("Алекс", 5.5));
        zoo.animals.add(new Zoo.Penguin("Шкипер", true, 8));
        zoo.animals.add(new Zoo.Penguin("Ковальски", true, 7));
        zoo.animals.add(new Zoo.Penguin("Рико", false, 6));
        zoo.animals.add(new Zoo.Penguin("Прапор", false, 5));

        String result = new YAMLMapper().writeValueAsString(zoo);

        System.out.println(result);
    }
}
