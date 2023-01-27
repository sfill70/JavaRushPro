package com.javarush.task.sql.task13.task1304;

import com.javarush.task.sql.task13.task1304.entities.Author;
import org.hibernate.Session;
import org.hibernate.query.Query;

/* 
Автор книги или книга автора?
Есть три класса-ентити: Author, Book и Publisher и таблицы, которые им соответствуют:
- таблица publisher с колонками id, name, type, discoverer, discovery_date;
- таблица author с колонками id, first_name, last_name, full_name;
- таблица book с колонками id, title, author_id, publisher_id, publication_year, isbn.
Расставь аннотации в классе Author перед полем books.

В методе main получи сессию из MySessionFactory.getSessionFactory().
Напиши hql-запрос для получения автора с полным именем 'Mark Twain'.
Выведи в консоль все его книги.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Author> query = session.createQuery("from Author where fullName = :AUTHOR_FULLNAME", Author.class);
            query.setParameter("AUTHOR_FULLNAME", "Mark Twain");
            Author author = query.getSingleResult();

            author.getBooks().forEach(System.out::println);
        }
    }
}
