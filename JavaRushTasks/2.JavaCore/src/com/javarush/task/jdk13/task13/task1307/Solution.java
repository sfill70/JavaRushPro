package com.javarush.task.jdk13.task13.task1307;

/* 
Том, Джерри и Спайк
*/

public class Solution {
    public static void main(String[] args) {

    }

    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    public class Dog implements Eat, Movable {
        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public class Cat implements Eat, Edible, Movable {
        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }

        @Override
        public void eat() {

        }
    }

    public class Mouse implements Edible, Movable {
        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }
    }
}