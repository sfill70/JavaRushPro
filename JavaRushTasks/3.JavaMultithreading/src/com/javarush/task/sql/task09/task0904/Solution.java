package com.javarush.task.sql.task09.task0904;

import java.util.List;

/* 
Все имена
Если ранее не подключал зависимости, то подключи их. Для этого Alt + Ctrl + Shift + S (в Идее), вкладка Libraries.
Зависимости можна скачать здесь: https://javarush.com/downloads/ide/javarush/hibernate.zip
Архив распакуй, и каждую зависимость добавь к модулю. Эта часть задания не проверяется, но если ее не выполнить -
ты не сможешь локально выполнять код. Добавь в метод getAllAnimals код для создания (открытия) сессии и
получения всех животных из базы данных. Не забудь закрыть сессию после завершения работы с ней или возникновения исключения.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        AnimalManager animalManager = new AnimalManager();
        List<Animal> animals = animalManager.getAllAnimals();

        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }
}
