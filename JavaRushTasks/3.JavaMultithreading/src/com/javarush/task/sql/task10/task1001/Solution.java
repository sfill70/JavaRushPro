package com.javarush.task.sql.task10.task1001;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/* 
task1001
Если ранее не подключал зависимости, то подключи их.
Для этого Alt + Ctrl + Shift + S (в Идее), вкладка Libraries.
Зависимости можно скачать здесь: https://javarush.com/downloads/ide/javarush/hibernate.zip
Архив распакуй, и каждую зависимость добавь к модулю. Эта часть задания не проверяется, но если ее не выполнить -
ты не сможешь локально выполнять код. В методе main получи сессию из MySessionFactory.getSessionFactory().
Напиши запрос на hql для получения колонки smth из таблицы employee. Отфильтруй значения по age > 18, отсортируй по smth и
убери дубликаты. Выведи значения в консоль, каждое с новой строки.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Employee dog = new Employee();
        dog.setName("Dina");
        dog.setAge(21);
        dog.setSmth("Dog");




        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(dog);
            transaction.commit();
            Query<Employee> query1 = session.createQuery("from Employee", Employee.class);
            Query<String> query = session.createQuery("select distinct smth from Employee where age > 18 order by smth", String.class);
            query.list().forEach(System.out::println);
        }
    }
}