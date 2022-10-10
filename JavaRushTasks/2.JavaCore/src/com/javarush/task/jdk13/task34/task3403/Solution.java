package com.javarush.task.jdk13.task34.task3403;

/* 
Разложение на множители с помощью рекурсии
Разложение на множители с помощью рекурсии
Разложить целое число n > 1 на простые множители.
Вывести в консоль через пробел все множители в порядке возрастания.
Написать рекурсивный метод для вычисления простых множителей.
Не создавай в классе Solution дополнительные поля.

Пример:
132

Вывод на консоль:
2 2 3 11
*/

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.recurse(132);
        solution.recurse(3571);
        solution.recurse(123455);
    }

    public void recurse(int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                recurse(n / i);
                break;
            }
        }

        //без рекурсии
        /*for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }
        }*/

        //делает в 2 раза меньше проходов
        /*while (n % 2 == 0) {
            System.out.println(2);
            n = n / 2;
        }
        for (int i = 3; i <= n; i = i + 2) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }
        }*/
    }
}
