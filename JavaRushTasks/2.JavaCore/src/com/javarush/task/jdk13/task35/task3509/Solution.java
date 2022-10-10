package com.javarush.task.jdk13.task35.task3509;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* 
Wildcards для коллекций
sum - суммирует все элементы списка, в котором находятся любые числа,
multiply - перемножает между собой все элементы списка, в котором находятся любые числа,
concat - соединяет все элементы списка в одну строку,
combine - принимает на вход список любых коллекций и возвращает результирующий список,
 в котором находятся все элементы из списков.
Добавь для каждого входящего типа List подходящий шаблон (wildcard), чтобы метод мог
 принимать только те элементы, которые может обработать.
*/

public class Solution {

    public static void main(String[] args) {
    }

    public static Number sum(List <? extends Number>list) {
        Double result = 0.0;
        for (int i = 0; i < list.size(); i++) {
            Number numb = (Number) list.get(i);
            result += numb.doubleValue();
        }
        return result;
    }

    public static Number multiply(List <? extends Number> list) {
        Double result = 1.0;
        for (int i = 0; i < list.size(); i++) {
            Number numb = (Number) list.get(i);
            result *= numb.doubleValue();
        }
        return result;
    }

    public static String concat(List <? extends Object> list) {
        StringBuilder builder = new StringBuilder();
        for (Object obj : list) {
            builder.append(obj);
        }
        return builder.toString();
    }

    public static Collection combine(List<? extends Collection> list) {
        List result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Collection collection = (Collection) list.get(i);
            result.addAll(collection);
        }
        return result;
    }
}
