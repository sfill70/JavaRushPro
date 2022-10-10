package com.javarush.task.jdk13.task23.task2301;

/* 
Inner
Реализовать метод getTwoSolutions, который должен возвращать массив из 2-х экземпляров класса Solution.
Для каждого экземпляра класса Solution инициализировать поле innerClasses двумя значениями.
Инициализация всех данных должна происходить только в методе getTwoSolutions.
*/

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public static void main(String[] args) {
        for (Solution sol:getTwoSolutions()
             ) {
            System.out.println(sol);
            for (InnerClass in :
                    sol.innerClasses) {
                System.out.print(in +"  ");
            }

        }
    }

    public static Solution[] getTwoSolutions() {
        Solution[] solutionsArray = new Solution[2];
        Solution solution1 = new Solution();
        Solution solution2 = new Solution();
        solution1.innerClasses[0] = new InnerClass();
        solution1.innerClasses[1] = new InnerClass();
        solution2.innerClasses[0] = new InnerClass();
        solution2.innerClasses[1] = new InnerClass();
        solutionsArray[0] = solution1;
        solutionsArray[1] = solution2;
        return solutionsArray;
    }

    public static class InnerClass {
    }
}
