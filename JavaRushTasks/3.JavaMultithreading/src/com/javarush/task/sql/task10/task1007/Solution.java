package com.javarush.task.sql.task10.task1007;


import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/* 
task1007
Если ранее не подключал зависимости, то подключи их. Для этого Alt + Ctrl + Shift + S (в Идее),
вкладка Libraries. Зависимости можно скачать здесь: https://javarush.com/downloads/ide/javarush/hibernate.zip
Архив распакуй, и каждую зависимость добавь к модулю. Эта часть задания не проверяется, но если ее не выполнить -
ты не сможешь локально выполнять код. В методе getIn получи сессию из MySessionFactory.getSessionFactory().
Напиши запрос на hql для получения списка Employee у которых smth равняется одной из строк из списка in. Employee должны быть отсортированы по возрасту по возрастанию. Верни полученный список.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        getIn(List.of("hr", "dev", "qa")).forEach(System.out::println);
    }

    public static List<Employee> getIn(List<String> in) {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Employee> query = session.createQuery("from Employee where smth IN (:LIST) order by age", Employee.class);
            query.setParameter("LIST", in);
            return query.list();
        }

    }
}