package com.javarush.task.sql.task09.task0902;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* 
Entity
Подключи зависимости в проект. Для этого нажми Alt + Ctrl + Shift + S (в Идее), вкладка Libraries.
Зависимости можно скачать здесь.
Архив распакуй, каждую зависимость добавь к модулю. Эта часть задания не проверяется, но если ее не выполнить —
ты не сможешь локально выполнять код.

Добавь в публичный класс Animal приватные поля: id (Long), name (String), age (Integer), family (String).
У класса должны присутствовать аннотации @Entity и @Table (имя таблицы animal_table, схема — test).
У всех полей должны присутствовать геттеры и сеттеры.
У поля id должна присутствовать соответствующая аннотация.
У остальных полей должна присутствовать аннотация @Column, в которой указано имя колонки. Имя колонки совпадает с названием поля.
*/
//напишите тут ваш код

@Entity
@Table(name = "animal_table", schema = "test")
public class Animal {
    @Id
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;
    @Column(name = "family")
    private String family;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}