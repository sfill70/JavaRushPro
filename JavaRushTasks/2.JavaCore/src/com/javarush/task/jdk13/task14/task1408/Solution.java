package com.javarush.task.jdk13.task14.task1408;

import java.util.ArrayList;
import java.util.List;

/* 
Нужно больше лайков!
В нашей социальной сети публикациям можно будет ставить лайки разных видов.

В перечислении LikeStatus хранятся все возможные виды лайков.

Когда публикации ставят тот или иной вид лайка, к общему числу лайков
 прибавляется или отнимается определенное число, заданное в методе getOriginalLikeValue.

Твоя задача:

В методе getOriginalLikeValue заменить switch statement на switch expression, оставив прежнюю логику.
Реализовать метод getLikesCount, который должен вернуть общее число лайков данной статьи.
 К примеру, если у статьи имеются такие лайки: HOT, HOT, AWFUL, то общее число лайков будет 2 + 2 - 2 = 4.
*/

public class Solution {

    public static void main(String[] args) {
        List<Article> articles = new ArrayList<>();
        articles.add(new Article("О вкусной и здоровой пище"));
        articles.add(new Article("О котиках"));
        articles.add(new Article("Остроконечники против тупоконечников"));
        articles.add(new Article("Последние новости от Би-Би-Си"));
        articles.add(new Article("Как открыть свою сыроварню"));
        articles.add(new Article("Британские ученые узнали есть ли польза от нововведений, науки и прогресса"));

        printReport(articles);
    }

    public static void printReport(List<Article> articles) {
        for (Article article : articles) {
            System.out.printf("%s : %d\n", article.getName(), article.getLikesCount());
        }
    }
}
