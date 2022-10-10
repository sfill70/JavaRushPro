package com.javarush.task.jdk13.task41.task4102;

/* 
Фирменный рецепт
Сейчас метод main делает самую простую пиццу. Давай используем паттерн декоратор, чтобы разнообразить ассортимент.

Сначала создай класс PizzaDecorator. Он должен быть абстрактным и реализовывать интерфейс Pizza.
У него должно быть приватное финальное поле decoratedPizza типа Pizza, которое инициализируется в конструкторе.
Реализуй методы getCost и getIngredients: они должны вызывать соответствующие методы у decoratedPizza.

Далее создай три класса: WithChicken, WithSausage, WithArugula. Пусть они все наследуют PizzaDecorator.
Их конструкторы должны просто вызывать конструктор родительского класса. Переопредели методы:

у WithChicken метод getCost добавляет к стоимости 20, метод getIngredients добавляет к ингредиентам ", курица";
у WithSausage метод getCost добавляет к стоимости 25, метод getIngredients добавляет к ингредиентам ", колбаса";
у WithArugula метод getCost добавляет к стоимости 15, метод getIngredients добавляет к ингредиентам ", руккола".
Раскомментируй код в методе main и посмотри, что получилось.
Добавь еще декораторов для любимых ингредиентов и придумай, как улучшить программу.
*/

public class Solution {

    public static void main(String[] args) {
        Pizza pizza = new SimplePizza();
        printInfo(pizza);

        pizza = new WithChicken(pizza);
        printInfo(pizza);

        pizza = new WithSausage(pizza);
        printInfo(pizza);

        pizza = new WithArugula(pizza);
        printInfo(pizza);
    }

    public static void printInfo(Pizza c) {
        System.out.println("Итого: " + c.getCost() + "; Состав: " + c.getIngredients());
    }
}
