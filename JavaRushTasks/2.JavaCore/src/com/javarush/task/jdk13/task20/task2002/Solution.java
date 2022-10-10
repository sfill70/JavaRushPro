package com.javarush.task.jdk13.task20.task2002;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Как сериализовать JavaRush?
Сделай так, чтобы сериализация класса JavaRush была возможной.
*/

public class Solution {
    public static class JavaRush implements Serializable {
        public List<User> users = new ArrayList<>();

        /*public JavaRush(User... user) {
            if (user != null) {
                this.users.addAll(Arrays.asList(user));
            }
        }*/
    }

    public static void main(String[] args) {


    }
}
