package com.javarush.task.sql.task13.task1302;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/* 
Расстановка аннотаций 2
Есть класс-ентити Author, у автора могут быть достижения achievements. Не все достижения одинаково ценные,
поэтому они упорядочены с помощью achievement_index и хранятся в списке List.

Добавь аннотации перед полем achievements в классе Author, чтобы программа корректно обрабатывала данные из таблиц:
- таблица author с колонками id, first_name, last_name, full_name;
- таблица author_achievement с колонками author_id, achievement, achievement_index.
*/

public class Solution {

    public static void main(String[] args) {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Author> query = session.createQuery("from Author", Author.class);
            List<Author> authors = query.list();

            authors.forEach(author -> {
                List<String> achievements = author.getAchievements();
                if (achievements.size() > 0) {
                    System.out.println(author.getFullName() + ":");
                    achievements.forEach(System.out::println);
                }
            });
        }
    }
}
