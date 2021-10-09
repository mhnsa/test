package com.tregulov.course.base.lesson11;

public class Employee {
    public String name;
    public double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double multiplyTwoMethod(double a) {
        return a*2;
    }

    public double salaryDouble(){
        salary = salary*2;
        return salary;
    }

}

class EmployeeTest {
    public static void main(String[] args) {
        Employee ivan = new Employee("Ivan", 100.5);
        double d = ivan.multiplyTwoMethod(ivan.salary);
        System.out.println(d);
        System.out.println(ivan.salary);
        ivan.salaryDouble();
        System.out.println(ivan.salary);
    }
}