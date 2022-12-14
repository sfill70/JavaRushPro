package com.javarush.task.jdk13.task27.task2707;

/* 
Расставь wait-notify
Расставь wait-notify
Расставь wait-notify.

Пример вывода:
Thread-0 MailServer received: [Person [Thread-1] wrote an email 'AAA'] in 1001 ms after start
*/

public class Solution {
    public static void main(String[] args) {
        Mail mail = new Mail();
        Thread server = new Thread(new MailServer(mail));
        Thread amigo = new Thread(new Person(mail));

        server.start();
        amigo.start();
    }
}
