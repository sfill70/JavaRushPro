package com.javarush.task.sql.task10.task1004;

import jakarta.persistence.*;

/*Есть три класса-ентити: Author, Book и Publisher. Расставь в них аннотации, учитывая,
что Author и Publisher являются полями Book. Для упрощения считаем, что у каждой книги может быть только один автор.
Соответствующие таблицы: - таблица publisher с колонками id, name, type, discoverer, discovery_date; -
таблица author с колонками id, first_name, last_name, full_name; - таблица book с колонками id, title, author_id,
publisher_id, publication_year, isbn.*/

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "full_name")
    private String fullName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
