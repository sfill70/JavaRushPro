package com.javarush.task.sql.task13.task1303;

import org.hibernate.Session;
import org.hibernate.query.Query;
import com.javarush.task.sql.task13.task1303.entities.Publisher;

import java.util.List;

/* 
Опять книги
Есть три класса-ентити: Author, Book и Publisher и таблицы, которые им соответствуют:
- таблица publisher с колонками id, name, type, discoverer, discovery_date;
- таблица author с колонками id, first_name, last_name, full_name;
- таблица book с колонками id, title, author_id, publisher_id, publication_year, isbn.

Расставь аннотации в классе Book перед полями author и publisher. На данный момент считаем,
что у каждой книги может быть только один автор и только один издатель.

В методе main получи сессию из MySessionFactory.getSessionFactory().
Напиши hql-запрос для получения всех издателей, которые публиковали автора 'Mark Twain'.
Выведи в консоль названия полученных издателей.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<Publisher> publishers;

        //напишите тут ваш код
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Publisher> query = session.createQuery("select distinct library.publisher from Book library where library.author.fullName = :AUTHOR_FULLNAME", Publisher.class);
//            С алиасом
//            Query<Publisher> query = session.createQuery("select distinct b.publisher from Book b where b.author.fullName = :AUTHOR_FULLNAME", Publisher.class);
            query.setParameter("AUTHOR_FULLNAME", "Mark Twain");
            publishers = query.list();
        }
        publishers.stream().map(Publisher::getName).forEach(System.out::println);
    }
}
