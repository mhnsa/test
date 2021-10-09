package com.tregulov.course.reflection_examples;

import java.lang.reflect.Field;

public class Ex3 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10, "Mark", "IT");
        Class employeeClass = Class.forName("com.tregulov.course.reflection_examples.Employee");

        Field salary = employeeClass.getDeclaredField("salary");
        salary.setAccessible(true);
        double salaryValue = (double) salary.get(employee);
        System.out.println(salaryValue);



    }


}
