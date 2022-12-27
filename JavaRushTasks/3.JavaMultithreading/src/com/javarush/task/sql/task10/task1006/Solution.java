package com.javarush.task.sql.task10.task1006;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

/* 
task1006
Если ранее не подключал зависимости, то подключи их. Для этого Alt + Ctrl + Shift + S (в Идее),
вкладка Libraries. Зависимости можно скачать здесь: https://javarush.com/downloads/ide/javarush/hibernate.zip Архив распакуй,
и каждую зависимость добавь к модулю. Эта часть задания не проверяется, но если ее не выполнить -
ты не сможешь локально выполнять код. В методе getBetween получи сессию из MySessionFactory.getSessionFactory().
Напиши запрос на hql для получения списка Employee у которых возраст больше параметра from, но меньше параметра to.
Employee должны быть отсортированы по возрасту по возрастанию. Верни полученный список.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        getBetween(25, 32).forEach(System.out::println);
    }

    public static List<Employee> getBetween(int from, int to) {

        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Employee> query = session.createQuery("from Employee where age > :FROM and age < :TO order by age", Employee.class);
            query.setParameter("FROM", from);
            query.setParameter("TO", to);
            return query.list();
        }

    }
}