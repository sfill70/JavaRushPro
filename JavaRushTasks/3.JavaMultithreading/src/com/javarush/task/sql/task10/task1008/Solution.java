package com.javarush.task.sql.task10.task1008;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/* 
task1008
Если ранее не подключал зависимости, то подключи их. Для этого Alt + Ctrl + Shift + S (в Идее),
вкладка Libraries. Зависимости можно скачать здесь: https://javarush.com/downloads/ide/javarush/hibernate.zip
Архив распакуй, и каждую зависимость добавь к модулю. Эта часть задания не проверяется, но если ее не выполнить -
ты не сможешь локально выполнять код.
В методе getSorted получи сессию из MySessionFactory.getSessionFactory().
Напиши запрос на hql для получения списка Employee отсортированных по возрастанию возраста.
Запрос должен вернуть 10 Employee начиная с 5. Метод getSorted должен вернуть полученный список.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        getSorted(5, 10).forEach(System.out::println);
    }

    public static List<Employee> getSorted(int offset, int limit) {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Employee> query = session.createQuery("from Employee order by age ", Employee.class);
            query.setFirstResult(offset);
            query.setMaxResults(limit);
            return query.list();
        }

    }
}