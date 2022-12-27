package com.javarush.task.sql.task10.task1003;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/* 
task1003
Если ранее не подключал зависимости, то подключи их. Для этого Alt + Ctrl + Shift + S (в Идее),
вкладка Libraries. Зависимости можно скачать здесь: https://javarush.com/downloads/ide/javarush/hibernate.zip
Архив распакуй, и каждую зависимость добавь к модулю. Эта часть задания не проверяется, но если ее не выполнить -
ты не сможешь локально выполнять код. В методе promoteAll получи сессию из MySessionFactory.getSessionFactory().
Напиши запрос на hql для добавления 'senior ' в начало текущего значения колонки smth для всех сотрудников. Например,
если значение smth было 'admin', то должно стать 'senior admin'.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        promoteAll();
    }

    public static void promoteAll() {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("update Employee set smth = concat('senior ', smth)");
            query.executeUpdate();
            tx.commit();
        }

    }
}