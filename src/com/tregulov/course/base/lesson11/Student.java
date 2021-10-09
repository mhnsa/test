package com.tregulov.course.base.lesson11;

public class Student {
    String name;
    int course;
    double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swapStudents(Student st1, Student st2) {
        Student st3;
        st3 = st1;
        st1 = st2;
        st2 = st3;
    }


    public static void main(String[] args) {
//        Student st1 = new Student("Mark", 3, 9.5);
//        Student st2 = new Student("Petr", 2, 5.5);
//
//        swapStudents(st1, st2);
//
//        System.out.println(st2.name);
//        System.out.println(st1.name);
        int a = 20;
        int b = 10;
        int max = a > b ? a : b;
        System.out.println(max);

    }

}
