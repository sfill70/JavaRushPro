package com.javarush.task.pro.task16.task1616;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

/* 
Тренировка временных зон
*/

public class Solution {

    public static void main(String[] args) {
        /*for (String s: ZoneId.getAvailableZoneIds())
            if (s.toLowerCase().contains("Moscow".toLowerCase())) {
                System.out.println(s);
            }*/

        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        return new TreeSet<String>(ZoneId.getAvailableZoneIds());
    }

    static ZonedDateTime getBeijingDateTime() {
        return ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
    }
}
