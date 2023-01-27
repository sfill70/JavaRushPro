package com.javarush.task.sql.task10.task1010;


import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import java.util.List;

/* 
task1010
Если ранее не подключал зависимости, то подключи их. Для этого Alt + Ctrl + Shift + S (в Идее),
вкладка Libraries. Зависимости можно скачать здесь: https://javarush.com/downloads/ide/javarush/hibernate.zip
Архив распакуй, и каждую зависимость добавь к модулю. Эта часть задания не проверяется, но если ее не выполнить -
ты не сможешь локально выполнять код.
В методе getAll получи сессию из MySessionFactory.getSessionFactory().
С помощью сессии создай NativeQuery для получения всех Employee из таблицы employee в порядке возрастания id.
Метод getAll должен вернуть полученный список.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        getAll().forEach(System.out::println);
    }

    public static List<Employee> getAll() {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            NativeQuery<Employee> query = session.createNativeQuery("select * from Employee order by id", Employee.class);
            return query.list();
        }

    }
}