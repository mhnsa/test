package com.tregulov.course.comparation;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.id - o2.id;
    }
}

class NameComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}
