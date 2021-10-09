package com.tregulov.course.annotation_examples;

public class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }

    void showInfo() {
        System.out.println("It's a Parent class. Name = " + name);
    }
}
