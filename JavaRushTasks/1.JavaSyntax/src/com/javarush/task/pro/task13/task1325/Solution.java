package com.javarush.task.pro.task13.task1325;

import java.util.*;

/* 
Телефонная книга
*/

public class Solution {

    public static void main(String[] args) {
        TreeMap<String, String> phoneBook = new TreeMap<>();

        phoneBook.put("Войтиков Дмитрий", "555-55-66");
        phoneBook.put("Бочкарев Петр", "950-44-66");
        phoneBook.put("Власов Василий", "554-55-66");
        phoneBook.put("Александров Алексей", "505-22-66");
        phoneBook.put("Виноградов Максим", "550-55-33");
        phoneBook.put("Андреев Андрей", "555-555-555");
        phoneBook.put("Громов Евгений", "558-20-66");
        phoneBook.put("Брагин Иван", "455-65-66");
        phoneBook.put("Алексеев Александр", "500-87-66");
        phoneBook.put("Глазов Виктор", "355-59-86");

        TreeMap<String, String> contactsByFirstLetter = getContactsStartsWith(phoneBook, "Ал");

        if (contactsByFirstLetter.isEmpty()) {
            System.out.println("Контакты не найдены.");
        } else {
            for (Map.Entry<String, String> entry : contactsByFirstLetter.entrySet()) {
                System.out.printf("%s, %s%n", entry.getKey(), entry.getValue());
            }
        }
    }

    public static TreeMap<String, String> getContactsStartsWith(TreeMap<String, String> map, String startsWith) {
        TreeMap<String, String> result = new TreeMap<>();
       /* result = new TreeMap<>(map.tailMap(startsWith,true));
        System.out.println(map.subMap(startsWith,true,startsWith,true).getClass().getSimpleName());
        System.out.println(result.getClass().getSimpleName());*/
        for (String name : map.keySet()
        ) {
            if (name.toLowerCase().startsWith(startsWith.toLowerCase())) {
                result.put(name, map.get(name));
            }

        }
        return result;
    }

//    Решение JavaRash
   /* public static TreeMap<String, String> getContactsStartsWith(TreeMap<String, String> map, String startsWith) {
        TreeMap<String, String> result = new TreeMap<>();
        NavigableSet<String> keys = map.navigableKeySet();
        System.out.println(keys);
        for (String key : keys) {
            if (key.toLowerCase().startsWith(startsWith.toLowerCase())) {
                result.put(key, map.get(key));
            }
        }
        return result;
    }*/
}