package com.javarush.task.sql.task10.task1005;

import org.hibernate.Session;
import org.hibernate.query.Query;
import com.javarush.task.sql.task10.task1005.entities.Book;

import java.util.List;

/* 
task1005
Если ранее не подключал зависимости, то подключи их. Для этого Alt + Ctrl + Shift + S (в Идее), вкладка Libraries.
Зависимости можно скачать здесь: https://javarush.com/downloads/ide/javarush/hibernate.zip
Архив распакуй, и каждую зависимость добавь к модулю. Эта часть задания не проверяется, но если ее не выполнить -
ты не сможешь локально выполнять код. В методе main получи сессию из MySessionFactory.getSessionFactory().
Напиши запрос на hql для получения книг из таблицы book, у которых full_name автора 'Mark Twain' и name издателя 'Фолио'.
Полученные книги выведи в консоль.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<Book> books;
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Book> query = session.createQuery("from Book b where author.fullName = 'Mark Twain' and publisher.name = 'Фолио'", Book.class);
            books = query.list();
        }

        books.forEach(System.out::println);
    }
}