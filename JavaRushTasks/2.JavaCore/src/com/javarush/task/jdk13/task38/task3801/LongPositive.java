package com.javarush.task.jdk13.task38.task3801;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*Надо бвло добавить вот эту строку -->*/
@Retention(RetentionPolicy.RUNTIME)

@Target(value = ElementType.FIELD)
public @interface LongPositive {
}
