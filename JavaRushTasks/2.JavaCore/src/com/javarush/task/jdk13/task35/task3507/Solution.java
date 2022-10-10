package com.javarush.task.jdk13.task35.task3507;

import java.util.*;

/* 
Collections & Generics
Реализуй вспомогательныe методы в классе Solution, которые должны создавать соответствующую коллекцию
и помещать туда переданные объекты.
Методы newArrayList, newHashSet параметризируй типом T.
Метод newHashMap параметризируй типами К(ключ) и V(значение). Аргументы метода newHashMap должны
принимать списки, в которых содержатся наследники типов K и V.
Возвращаемые коллекции должны быть такого же типа, что и переданные в метод объекты.

Подсказка: в методе newHashMap нужно проверить чтобы списки ключей и значений совпадали по размерам,
в противном случае кинь IllegalArgumentException.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(newArrayList(1, 2, 3, 4));
        System.out.println(newHashSet(1, 2, 3, 4));
        System.out.println(newHashMap(newArrayList(1,2,3,4) ,newArrayList("q","w","e","r")));
    }

    public static <T> ArrayList<T> newArrayList(T... elements) {
        //напишите тут ваш код
        return new ArrayList<T>(List.of(elements));
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        //напишите тут ваш код
        return new HashSet<T>(List.of(elements));
    }

    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values) {
        if (keys.size() != values.size()) {
            throw new IllegalArgumentException();
        }
        HashMap<K, V> hashMap = new HashMap<K, V>();
        for (int i = 0; i <keys.size() ; i++) {
            hashMap.put(keys.get(i),values.get(i) );
        }

        return hashMap;
    }
}
