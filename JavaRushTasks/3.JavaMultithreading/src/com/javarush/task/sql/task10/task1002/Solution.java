package com.javarush.task.sql.task10.task1002;

import org.hibernate.Session;
import org.hibernate.query.Query;

/* 
task1002
Если ранее не подключал зависимости, то подключи их. Для этого Alt + Ctrl + Shift + S (в Идее),
вкладка Libraries. Зависимости можно скачать здесь: https://javarush.com/downloads/ide/javarush/hibernate.zip
Архив распакуй, и каждую зависимость добавь к модулю. Эта часть задания не проверяется, но если ее не выполнить -
ты не сможешь локально выполнять код. В методе getDirector получи сессию из MySessionFactory.getSessionFactory().
Напиши запрос на hql для получения Employee у которого smth = 'director'. Результатом запроса ожидается одно значение,
верни его в методе getDirector.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(getDirector());
    }

    public static Employee getDirector() {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Employee> query = session.createQuery("from Employee where smth = 'director'", Employee.class);
            return query.uniqueResult();
        }
    }
}