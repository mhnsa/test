package com.tregulov.course.annotation_examples;

public class Child extends Parent{
    public Child(String name) {
        super(name);
    }

    @Override
    void showInfo() {
        System.out.println("It's a Child class. Name = " + name);
    }
}
