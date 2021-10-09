package com.tregulov.course.annotation_examples;

@MyAnnotation
public class Employee {


    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    @MyAnnotation
    public void increaseSalary() {
        salary *= 2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

