package com.javarush.task.jdk13.task34.task3407;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;

/* 
Собиратель типов
Реализуй метод getTypes который принимает oдин тип, и должен вернуть множество типов
содержащихся во входном типе. Например, текущий метод main должен вывести на экран такие типы
(ypes, порядок не обязателен): interface java.util.Map class java.util.concurrent.
TimeUnit interface java.util.function.BiFunction class java.lang.Integer class java.lang.Long
class java.lang.Boolean interface java.util.List class java.lang.String
Сигнатуру метода getTypes не изменяй.
Методы main() не участвует в тестировании.
*/

public class Solution {

    private Map<TimeUnit, BiFunction<Integer, Long, Map<Boolean, List<String>>>> field;

    public static void main(String[] args) throws Exception {
        getTypes(Solution.class.getDeclaredField("field").getGenericType()).forEach(System.out::println);
    }

    public static Set<Type> getTypes(Type type) {
        Set<Type> result = new LinkedHashSet<>();
        if (!(type instanceof ParameterizedType)) {
            result.add(type);
        } else {
            ParameterizedType parameterizedTypeArgument = (ParameterizedType) type;
            result.add(parameterizedTypeArgument.getRawType());
            for (Type typeArgument : parameterizedTypeArgument.getActualTypeArguments()) {
                result.addAll(getTypes(typeArgument));
            }
        }

        return result;
    }
   /* public static Set<Type> getTypes(Type type) {
        //напишите тут ваш код

        return null;
    }*/
}
