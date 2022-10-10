package com.javarush.task.jdk13.task34.task3406;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

/* 
Классные методы
Реализуй метод getMethods, который принимает множество классов, и должен вернуть мапу,
в которой ключ - это класс, а значение - множество имен статических методов этого класса.
Сигнатуру метода getMethods не изменяй. Методы main() и print() не участвуют в тестировании.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        print(getMethods(Set.of(Object.class, Math.class, Arrays.class)));
    }

    public static Map<Class<?>, Set<String>> getMethods(Set<Class<?>> classes) {
        Map<Class<?>, Set<String>> result = new HashMap<>();
        for (Class<?> clazz : classes
        ) {
            Set<String> setStaticMethod = new HashSet<>();
            for (Method method : clazz.getDeclaredMethods()
            ) {
                if (Modifier.isStatic(method.getModifiers())) {
                    setStaticMethod.add(method.getName());
                }
            }
            result.put(clazz, setStaticMethod);
        }
        return result;
    }


    public static void print(Map<?, ?> map) {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
