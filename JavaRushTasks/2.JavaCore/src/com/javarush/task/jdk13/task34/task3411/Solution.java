package com.javarush.task.jdk13.task34.task3411;

import java.lang.reflect.Field;

/* 
Приватный родитель
Реализуй метод setPrivateParentField: он должен приватному полю fieldName родительского класса
объекта childObject присвоить значение value. Ожидаемый вывод: начальная строка новая строка
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Child child = Child.class.getDeclaredConstructor().newInstance();
        System.out.println(child.getPrivateField());
        setPrivateParentField(child, "privateField", "новая строка");
        System.out.println(child.getPrivateField());
    }

    public static void setPrivateParentField(Object childObject, String fieldName, Object value) throws Exception {
        Class<?> clazz = childObject.getClass();
        Class<?> clazzParent = clazz.getSuperclass();
        Field field = clazzParent.getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(childObject, value);

    }
    /*public static void setPrivateParentField(Object childObject, String fieldName, Object value) throws Exception {
        Field privateField = childObject.getClass().getSuperclass().getDeclaredField(fieldName);
        privateField.setAccessible(true);
        privateField.set(childObject, value);
    }*/
}
