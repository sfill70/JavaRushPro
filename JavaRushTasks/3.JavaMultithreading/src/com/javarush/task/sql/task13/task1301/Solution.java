package com.javarush.task.sql.task13.task1301;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Set;

/* 
Расстановка аннотаций
Есть класс-ентити Author, у автора могут быть статьи articles. Добавь аннотации перед полем articles в классе Author,
чтобы программа корректно обрабатывала данные из таблиц:
- таблица author с колонками id, first_name, last_name, full_name;
- таблица author_article с колонками author_id, article.
*/

public class Solution {

    public static void main(String[] args) {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Author> query = session.createQuery("from Author", Author.class);
            List<Author> authors = query.list();

            authors.forEach(author -> {
                Set<String> articles = author.getArticles();
                if (articles.size() > 0) {
                    System.out.println(author.getFullName() + ":");
                    articles.forEach(System.out::println);
                }
            });
        }
    }
}