package com.tregulov.course.enums;

public class Today {
    WeekDays weekDay;

    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    public void dayInfo() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Go to work");
                break;
            case SUNDAY:
            case SATURDAY:
                System.out.println("You can have a rest");
                break;
        }
    }
}
