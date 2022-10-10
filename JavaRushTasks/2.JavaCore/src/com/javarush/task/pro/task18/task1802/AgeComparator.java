package com.javarush.task.pro.task18.task1802;

import java.util.Comparator;

/* 
Сортировка по возрасту
В классе Solution есть статическое поле students, которое заполняется студентами (объектами типа Student) в методе main().
У студента (класс Student) есть имя (поле name) и возраст (поле age). Нужно отсортировать в программе студентов по возрасту в убывающем порядке (от старшего к младшему).
Для этого используется метод Collections.sort(ArrayList<Student>, Comparator<Student>), в который передается список студентов students и компаратор сортировки по убыванию возраста.

Твоя задача — реализовать этот компаратор. Для этого в классе AgeComparator нужно имплементировать интерфейс Comparator<Student> и реализовать метод int compare(Student student1, Student student2), который возвращает числовое значение со следующими условиями:

отрицательное число, если возраст студента student1 больше возраста студента student2;
положительное число, если возраст студента student1 меньше возраста студента student2;
0, если возраст студентов student1 и student2 одинаковый.
*/

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o, Student t1) {
        return Integer.compare(t1.getAge(), o.getAge());
    }
    //напишите тут ваш код
}
