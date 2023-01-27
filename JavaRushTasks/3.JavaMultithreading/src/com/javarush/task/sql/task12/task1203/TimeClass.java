package com.javarush.task.sql.task12.task1203;

/* 
Сохраняем объект в БД
*/

import jakarta.persistence.*;
import java.time.Instant;
import java.time.ZonedDateTime;

//напишите тут ваш код

    //напишите тут ваш код

    @Entity
    @Table(name = "time_table", schema = "test")
    public class TimeClass {
        @Id
        private Long id;

        @Column(name = "instant")
        private Instant instant;

        @Basic
        @Column(name = "zoned_time")
        private ZonedDateTime zonedDateTime;

        public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return id;
        }

        public Instant getInstant() {
            return instant;
        }

        public void setInstant(Instant instant) {
            this.instant = instant;
        }

        public ZonedDateTime getZonedDateTime() {
            return zonedDateTime;
        }

        public void setZonedDateTime(ZonedDateTime zonedDateTime) {
            this.zonedDateTime = zonedDateTime;
        }
    }