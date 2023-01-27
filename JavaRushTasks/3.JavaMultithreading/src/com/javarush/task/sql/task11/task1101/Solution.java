package com.javarush.task.sql.task11.task1101;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/* 
task1101
Сохрани созданный объект в БД (используй метод save) и присвой результат полю id1,
отсоедини объект от сессии (используй метод evict) и снова с помощью метода save сохрани тот же объект в БД
с присвоением результата полю id2. Запусти программу и убедись,
что до отсоединения и после id объекта в БД разные (id1 == id2 возвращает false).
*/

public class Solution {
    public static long id1;
    public static long id2;

    public static void main(String[] args) throws Exception {
        Animal animal = new Animal();
        animal.setName("Murka");
        animal.setAge(5);
        animal.setFamily("Cats");
        try {
            SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            id1 = (long) session.save(animal);
            session.evict(animal);
            id2 = (long) session.save(animal);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(id1 == id2);
    }
}