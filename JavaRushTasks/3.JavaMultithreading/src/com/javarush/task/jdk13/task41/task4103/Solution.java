package com.javarush.task.jdk13.task41.task4103;

import com.javarush.task.jdk13.task41.task4103.blood.BloodDB;
import com.javarush.task.jdk13.task41.task4103.blood.BloodDBProxy;
import com.javarush.task.jdk13.task41.task4103.blood.BloodSample;
import com.javarush.task.jdk13.task41.task4103.blood.DB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import static java.util.Objects.nonNull;

/* 
Surprise, анонимус!
В этой программе у нас есть банк крови, по которому можно осуществлять поиск. Ознакомься, как все работает.

Благодаря BloodDB доступ к базе данных открыт для всех. Тебе нужно ограничить доступ, используя имеющуюся систему безопасности.
Так как все должно пройти максимально прозрачно со стороны пользователя, воспользуемся паттерном Заместитель.
В пакете blood создай класс BloodDBProxy, который будет реализовывать тот же интерфейс, что и BloodDB.
В классе создай три поля:

private final SecuritySystem security — с помощью него можно будет обращаться к системе безопасности;
private BloodDB db — собственно объект, для которого мы делаем заместителя;
private final BloodSample denied — его можно сразу инициализировать значением new BloodSample(0, "access", "denied", null, null, null).
В классе BloodDBProxy создай конструктор без параметров, который:
инициализирует поле security;
считает с консоли две строки, логин и пароль;
попробует авторизоваться в системе безопасности с помощью метода authorize;
проверит, удачно ли прошла авторизация, и если удачно, то инициализирует поле db.
Реализуй в BloodDBProxy методы getById и find. Они должны проверить авторизацию в системе безопасности.
Если с авторизацией все хорошо, то перенаправить вызов объекту db.
Если же пользователь не авторизован, то методы должны вернуть объект denied.
И, наконец, в методе main в инициализации переменной database замени BloodDB на BloodDBProxy.

Подумай, как еще повысить безопасность или оптимизировать систему, добавив кеширующий прокси.
*/

public class Solution {

    public static void main(String[] args) throws InterruptedException, IOException {
        DB database = new BloodDBProxy();
//        DB database = new BloodDB();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Make request: ");
        String request = scanner.nextLine();

        if (request.matches("\\d+")) {
            BloodSample result = database.getById(Integer.parseInt(request));
            printSample(result);
        } else {
            List<BloodSample> results = database.find(request);
            printSamples(results);
        }
    }

    private static void printSample(BloodSample sample) {
        System.out.println(nonNull(sample) ? sample : "No results.");
    }

    private static void printSamples(List<BloodSample> samples) {
        if (samples.isEmpty()) {
            System.out.println("No results.");
        } else {
            samples.forEach(System.out::println);
        }
    }
}
