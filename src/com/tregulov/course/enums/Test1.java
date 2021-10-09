package com.tregulov.course.enums;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {
        Today today = new Today(WeekDays.SUNDAY);
        today.dayInfo();
        WeekDays w = WeekDays.SUNDAY;
        System.out.println(w.getMood());
        WeekDays w12 = WeekDays.valueOf("MONDAY");
        System.out.println(w12);

        WeekDays[] values = WeekDays.values();
        System.out.println(Arrays.toString(values));
    }
}
