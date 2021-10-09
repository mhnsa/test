package com.tregulov.course.comparation;

public class Employee {
    int id;
    String name;
    String surName;
    int salary;

    public Employee(int id, String name, String surName, int salary) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                '}';
    }

//    @Override
//    public int compareTo(Employee o) {
//        return this.name.compareTo(o.name);
//    }
}
