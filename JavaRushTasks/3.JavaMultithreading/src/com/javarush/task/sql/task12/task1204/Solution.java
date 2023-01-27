package com.javarush.task.sql.task12.task1204;

/* 
Время создания и изменения данных
Если ранее не подключал зависимости, то подключи их. Для этого Alt + Ctrl + Shift + S (в Идее),
вкладка Libraries. Зависимости можно скачать здесь: https://javarush.com/downloads/ide/javarush/hibernate.zip
Архив распакуй, и каждую зависимость добавь к модулю. Эта часть задания не проверяется, но если ее не выполнить
- ты не сможешь локально выполнять код.
1) Добавь в публичный класс Solution приватные поля: id (Long), name (String),
createDate (Date) и updateDate (Date).
2) У класса Solution должны присутствовать аннотации @Entity и @Table (имя таблицы names_table, схема - test).
3) У всех полей должны присутствовать геттеры и сеттеры.
4) У всех полей должны присутствовать соответствующие аннотации.
4.1) У поля id должна присутствовать аннотация @Id.
4.2) У поля name должна присутствовать аннотация @Column, в которой указано имя колонки "name".
4.3) У поля createDate должна присутствовать аннотация @Column, в которой указано имя колонки "create_date",
и все остальные нужные аннотации, которые требуются для колонки, которая хранит дату создания записи.
4.4) У поля updateDate должна присутствовать аннотация @Column, в которой указано имя колонки "update_date",
и все остальные нужные аннотации, которые требуются для колонки, которая хранит дату последнего изменения записи.
*/

import jakarta.persistence.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Properties;

//напишите тут ваш код
@Entity
@Table(name = "names_table", schema = "test")
public class Solution {
    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date")
    private Date createDate;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_date")
    private Date updateDate;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
