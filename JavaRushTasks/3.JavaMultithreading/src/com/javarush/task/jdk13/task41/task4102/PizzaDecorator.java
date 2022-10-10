package com.javarush.task.jdk13.task41.task4102;

public abstract class PizzaDecorator implements Pizza{
    private final Pizza decoratedPizza;

    public PizzaDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    public double getCost(){
        return decoratedPizza.getCost();
    }
    public String getIngredients(){
        return decoratedPizza.getIngredients();
    }
}
