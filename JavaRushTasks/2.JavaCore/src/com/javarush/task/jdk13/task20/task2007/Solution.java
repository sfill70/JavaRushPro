package com.javarush.task.jdk13.task20.task2007;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;

/* 
Сериализация в JSON
НЕОБХОДИМО: подключенные библиотеки jackson-databind и jackson-annotations версии 2.13.1.

Расставь JSON аннотации так, чтобы результат работы метода main был следующим:

{
"wildAnimal" : "Murka",
"over" : 3
}
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Cat cat = new Cat();
        cat.name = "Murka";
        cat.age = 5;
        cat.weight = 3;

        System.out.println(convertToJSON(cat));
    }

    public static String convertToJSON(Object object) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        return mapper.writeValueAsString(object);
    }

    public static class Cat {
        @JsonProperty("wildAnimal")
        public String name;
        @JsonIgnore
        public int age;
        @JsonProperty("over")
        public int weight;

        Cat() {
        }
    }
}
