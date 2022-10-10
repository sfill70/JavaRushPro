package com.javarush.task.jdk13.task41.task4109;

/* 
Протоклоны
Паттерн Prototype
Дана иерархия классов. Применим к ней паттерн Прототип, чтобы можно было копировать объекты
CguRequisition и User.
Во всех классах иерархии явно объяви пустой конструктор без параметров.
Добавь во все классы альтернативный конструктор, принимающий в качестве аргумента объект текущего класса.
Этот конструктор должен сначала передать выполнение родительскому конструктору, чтобы тот позаботился о полях,
объявленных в суперклассе, а затем скопировать из поданного объекта значения всех полей, объявленных в рамках
текущего класса.
В классе AbstractEntity объяви абстрактный метод AbstractEntity clone(). Реализуй его в классах CguRequisition
и User. Метод должен возвращать новый объект текущего класса, созданный с помощью конструктора из п.2.
Примечание: в конструкторе класса AbstractEntity вызывать конструктор суперкласса не нужно.
Примечание-2: в конструкторе класса RequisitionBase поле user должно копироваться с помощью метода clone
класса User.
В результате код в методе main должен компилироваться и выводить в консоль два разных объекта User.
*/

public class Solution {

    public static void main(String[] args) {
        CguRequisition prototype = new CguRequisition();
        prototype.id = 31;
        prototype.user = new User();
        prototype.user.displayName = "anonymous";

        CguRequisition requisitionClone = (CguRequisition) prototype.clone();
        System.out.println("Users should be different objects:");
        System.out.println(prototype.user + " - user");
        System.out.println(requisitionClone.user + " - cloned user");
        System.out.println(prototype.user.displayName);
        System.out.println(requisitionClone.user.displayName);
    }
}
