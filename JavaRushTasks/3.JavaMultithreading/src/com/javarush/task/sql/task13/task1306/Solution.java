package com.javarush.task.sql.task13.task1306;

import com.javarush.task.sql.task13.task1306.entities.Author;
import org.hibernate.Session;
import org.hibernate.query.Query;

/* 
Соавторство
Есть два класса-ентити: Author и Book. Таблицы, которые им соответствуют:
- таблица author с колонками id, first_name, last_name, full_name;
- таблица book с колонками id, title, publication_year, isbn.

Так же есть таблица author_book, в которой хранится информация, какие авторы написали какие книги.
В ней есть колонки author_id и book_id. У каждого автора может быть несколько книг, а у каждой книги несколько авторов.

Расставь аннотации в классе Author перед полем books и в классе Book перед полем authors.

В методе main получи сессию из MySessionFactory.getSessionFactory(). Выведи в консоль всех соавторов 'Mark Twain'.
Представим, что в нашей базе есть книги, у которых больше одного автора и один из них 'Mark Twain'.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Author> query = session.createQuery("from Author where fullName = :AUTHOR_FULLNAME", Author.class);
            query.setParameter("AUTHOR_FULLNAME", "Mark Twain");
            Author authorMarkTwain = query.getSingleResult();

            authorMarkTwain.getBooks()
                    .stream()
                    .flatMap(book -> book.getAuthors().stream())
                    .filter(author -> !authorMarkTwain.equals(author))
                    .distinct()
                    .map(Author::getFullName)
                    .forEach(System.out::println);
        }
    }
}
