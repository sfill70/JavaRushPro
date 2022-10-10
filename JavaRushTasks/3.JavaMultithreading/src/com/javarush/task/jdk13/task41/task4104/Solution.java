package com.javarush.task.jdk13.task41.task4104;

/* 
Фантастические твари
Паттерн Bridge
Разберись какие классы имеются, и что они делают.
Сейчас каждый класс кодирует три измерения: вид существа, способ его передвижения, издаваемые им звуки.
И на каждое сочетание придется создавать отдельный класс. Сейчас классов шесть, и это далеко не все
возможные комбинации измерений. Это уже похоже на мешанину, а что будет, если таким же образом добавить
еще несколько измерений? Тебе нужно навести порядок, применив шаблон мост.

Создай базовый класс абстракции и общие интерфейсы реализаций, размести их в отдельных пакетах:

создай пакет creature и в нем абстрактный класс Creature;
создай пакет move и в нем интерфейс MoveLogic с одним методом void move(String name);
создай пакет sound и в нем интерфейс SoundLogic с одним методом void sound(String name).
Создай классы конкретных реализаций:

в пакете move создай классы Fly, Swim и Crawl. Они все должны реализовывать MoveLogic. Метод move каждого
из классов должен выводить в консоль строку типа: name + " машет крыльями."
в пакете sound создай классы Bark, Meow и Speak. Они все должны реализовывать SoundLogic.
Метод sound каждого из классов должен выводить в консоль строку типа: name + " мяукает."
Добавь в класс абстракции ссылку на объекты реализации: в классе Creature создай два protected поля:
MoveLogic moveLogic и SoundLogic soundLogic. Добавь конструктор с двумя параметрами, инициализирующий эти поля.

В классе Creature добавь три публичных метода:

Абстрактный метод String getName();
void howDoIMove(), делегирующий работу реализации moveLogic. Пример: moveLogic.move(getName());
void howDoISound(), делегирующий работу реализации soundLogic.
Создай подклассы нашей абстракции: в пакете creature создай класс Cat наследующий Creature.
Реализуй метод getName чтобы он возвращал строку "Кошка". Добавь еще один метод public void catchMice(),
выводящий в консоль: getName() + " ловит мышей."

в пакете creature создай класс Cow наследующий Creature. Реализуй метод getName чтобы он возвращал строку
"Корова". Добавь еще один метод public void giveMilk(), выводящий в консоль: getName() + " дает молоко."
в пакете creature создай класс Human наследующий Creature. Реализуй метод getName чтобы он возвращал строку
"Человек". Добавь еще один метод public void searchMeaningOfLife(), выводящий в консоль: getName() + " ищет смысл жизни."
В методе main создай летающую мяукающую корову :)
*/

import com.javarush.task.jdk13.task41.task4104.creature.Cow;
import com.javarush.task.jdk13.task41.task4104.creature.Creature;
import com.javarush.task.jdk13.task41.task4104.move.Fly;
import com.javarush.task.jdk13.task41.task4104.sound.Meow;

public class Solution {

    public static void main(String[] args) {
        FlyingSpeakingСow cow = new FlyingSpeakingСow();
        cow.move();
        cow.sound();
        cow.giveMilk();

        SwimmingMeowingHuman human = new SwimmingMeowingHuman();
        human.move();
        human.sound();
        human.searchMeaningOfLife();

        Cow cow1 = new Cow(new Fly(), new Meow());
        cow1.howDoIMove();
        cow1.howDoISound();
        cow1.giveMilk();
    }
}
