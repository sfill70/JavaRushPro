package com.javarush.task.sql.task09.task0905;

/* 
task0905
Если ранее не подключал зависимости, то подключи их. Для этого Alt + Ctrl + Shift + S (в Идее),
вкладка Libraries. Зависимости можна скачать здесь: https://javarush.com/downloads/ide/javarush/hibernate.zip
Архив распакуй, и каждую зависимость добавь к модулю. Эта часть задания не проверяется, но если ее не выполнить -
ты не сможешь локально выполнять код. Реализуй методы по добавлению и удалению животного из базы. Каждый метод
должен открывать сессию, начинать транзакцию, выполнять необходимые действия, закрывать (комитить) транзакцию,
закрывать сессию.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        AnimalManager animalManager = new AnimalManager();

        System.out.println("Все животные:");
        for (Animal animal : animalManager.getAllAnimals()) {
            System.out.println(animal.getName());
        }

        Animal dog = new Animal();
        dog.setName("Dina");
        dog.setAge(2);
        dog.setFamily("Dog");

        animalManager.addAnimal(dog);

        System.out.println("Все животные, после добавления нового:");
        for (Animal animal : animalManager.getAllAnimals()) {
            System.out.println(animal.getName());
        }

        animalManager.removeAnimal(dog);

        System.out.println("Все животные, после удаления нового:");
        for (Animal animal : animalManager.getAllAnimals()) {
            System.out.println(animal.getName());
        }
    }
}
