package com.javarush.task.jdk13.task34.task3405;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* 
Нарушение приватности
Реализуй метод getFields(T), который принимает объект любого типа и возвращает мапу Map<String, Object>.
Ключем мапы будет имя поля объекта, а значением — значение этого поля. Учти, что поля нужно брать
только приватные, но они также могут быть статическими и финальными.

Сигнатуру метода getFields(T) не изменяй. Методы main() и print() не участвуют в тестировании.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        User user = new User("Amigo", 21);
        print(getFields(user));

        Task task = new Task("task3405", true);
        print(getFields(task));
    }

    public static Map<String, Object> getFields(Object object) throws Exception {
        Map<String, Object> result = new HashMap<>();
        Field[] fields = object.getClass().getDeclaredFields();
//        System.out.println(Arrays.toString(fields));
        for (Field field : fields
        ) {
            if (Modifier.isPrivate(field.getModifiers())) {
//                System.out.println("private " + field.getName());
                field.setAccessible(true);
                result.put(field.getName(),field.get(object));
            }
        }
        return result;
    }

    public static void print(Map<?, ?> fields) {
        System.out.println("-------------------");
        fields.forEach((fieldName, fieldValue) -> System.out.println(fieldName + " = " + fieldValue));
    }
}
