package com.javarush.task.sql.task12.task1202;

/* 
Entity с вычислением
Если ранее не подключал зависимости, то подключи их. Для этого Alt + Ctrl + Shift + S (в Идее), вкладка Libraries.
Зависимости можно скачать здесь: https://javarush.com/downloads/ide/javarush/hibernate.zip Архив распакуй,
и каждую зависимость добавь к модулю. Эта часть задания не проверяется, но если ее не выполнить -
ты не сможешь локально выполнять код. Добавь в публичный класс Salaries приватные поля: employeeID (Long),
paymentCode (Boolean), employeeName (String), basicSalary (double), bonus (double), tax (double) и total (double).
У класса должны присутствовать аннотации @Entity и @Table (имя таблицы salaries_table, схема - salaries).
У всех полей должны присутствовать геттеры и сеттеры. У поля employeeID должна присутствовать соответствующая аннотация.
У поля paymentCode должна присутствовать аннотация @Type, в которой правильно указан тип NumericBooleanType.
У поля total должна присутствовать аннотация @Formula, в которой вычисляется общая сумма используя
формулу "basicSalary + bonus - tax". У всех полей, кроме employeeID, должна присутствовать аннотация @Column,
в которой указано имя колонки. Имя колонки должно совпадать с названием поля.
*/

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.Type;

//напишите тут ваш код
@Entity
@Table(name = "salaries_table", schema = "salaries")
public class Salaries {
    @Id
    private Long employeeID;

    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column(name = "paymentCode")
    private Boolean paymentCode;

    @Column(name = "employeeName")
    private String employeeName;
    @Column(name = "basicSalary")
    private double basicSalary;
    @Column(name = "bonus")
    private double bonus;
    @Column(name = "tax")
    private double tax;

    @Formula("basicSalary + bonus - tax")
    @Column(name = "total")
    private double total;

    public Long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Long id) {
        this.employeeID = id;
    }

    public Boolean getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(Boolean paymentCode) {
        this.paymentCode = paymentCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
