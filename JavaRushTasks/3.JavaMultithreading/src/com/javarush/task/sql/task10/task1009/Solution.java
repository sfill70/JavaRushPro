package com.javarush.task.sql.task10.task1009;


import org.hibernate.Session;
import org.hibernate.query.Query;

/* 
task1009
Если ранее не подключал зависимости, то подключи их. Для этого Alt + Ctrl + Shift + S (в Идее),
вкладка Libraries. Зависимости можно скачать здесь: https://javarush.com/downloads/ide/javarush/hibernate.zip
Архив распакуй, и каждую зависимость добавь к модулю. Эта часть задания не проверяется, но если ее не выполнить -
ты не сможешь локально выполнять код.
1. В методе getSalaryFund получи сессию из MySessionFactory.getSessionFactory().
Напиши запрос на hql для получения суммы значений колонки salary. Метод getSalaryFund должен вернуть сумму.
2. В методе getAverageAge получи сессию из MySessionFactory.getSessionFactory().
Напиши запрос на hql для получения среднего значения колонки age.
Метод getAverageAge должен вернуть среднее значение.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println("Salary fund: $" + getSalaryFund());
        System.out.println("Agerage age: " + getAverageAge());
    }

    public static Long getSalaryFund() {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Long> query = session.createQuery("select sum (salary) from Employee", Long.class);
            return query.uniqueResult();
        }

    }

    public static Double getAverageAge() {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Double> query = session.createQuery("select avg(age) from Employee", Double.class);
            return query.uniqueResult();
        }
    }
}