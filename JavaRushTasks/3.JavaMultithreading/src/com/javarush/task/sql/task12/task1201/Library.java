package com.javarush.task.sql.task12.task1201;

import jakarta.persistence.*;

/* 
Создаём Entity из класса
Если ранее не подключал зависимости, то подключи их. Для этого Alt + Ctrl + Shift + S (в Идее),
вкладка Libraries. Зависимости можно скачать здесь: https://javarush.com/downloads/ide/javarush/hibernate.zip
Архив распакуй, и каждую зависимость добавь к модулю. Эта часть задания не проверяется, но если ее не выполнить -
ты не сможешь локально выполнять код. Добавь в публичный класс Library приватные поля: id (Long), status (PublicationStatus),
publicationName (String) и isbn (String). У класса должны присутствовать аннотации @Entity и @Table (имя таблицы library_table).
 У всех полей должны присутствовать геттеры и сеттеры. У поля id должна присутствовать соответствующая аннотация.
 У поля status должна присутствовать аннотация @Enumerated, в которой указан ordinal enum тип, а также аннотация @Column,
 в которой указано имя колонки, которое совпадает с названием поля. У остальных полей должна присутствовать аннотация @Column,
 в которой указано имя колонки. Имя колонки должно совпадать с названием поля.
*/

//напишите тут ваш код
@Entity
@Table(name = "library_table")
public class Library {
    @Id
    private Long id;
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "status")
    private PublicationStatus status;
    @Column(name = "publicationName")
    private String publicationName;
    @Column(name = "isbn")
    private String isbn;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public PublicationStatus getStatus() {
        return status;
    }

    public void setStatus(PublicationStatus status) {
        this.status = status;
    }

    public String getPublicationName() {
        return publicationName;
    }

    public void setPublicationName(String publicationsName) {
        this.publicationName = publicationsName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
