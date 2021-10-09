package com.tregulov.course.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(101, "Ivan", "Petrov", 1222);
        Employee emp2 = new Employee(15, "Maks", "Rokov", 6452);
        Employee emp3 = new Employee(100, "Ivan", "Sidor", 8545);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        IdComparator idComparator = new IdComparator();
        NameComparator nameComparator = new NameComparator();

        System.out.println();
        System.out.println("I am in branch fix/1000");

        System.out.println("Before sorting");
        System.out.println(list);
        Collections.sort(list, nameComparator);
        System.out.println(list);
    }
}
