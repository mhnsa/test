package com.tregulov.course.annotation_examples;

import java.lang.annotation.Annotation;

public class Test2 {

    public static void main(String[] args) throws ClassNotFoundException {

        Class xiaomiClass = Class.forName("com.tregulov.course.annotation_examples.Xiaomi");
        Annotation annotation = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone) annotation;
        System.out.println(sm1.OS());
        System.out.println(sm1.yearOfCompanyCreation());

    }
}

@SmartPhone
class Xiaomi {
    String model;
    double price;
}

@SmartPhone(OS = "Ios", yearOfCompanyCreation = 1976)
class Iphone {
    String model;
    double price;
}