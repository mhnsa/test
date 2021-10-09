package com.tregulov.generics;

public class ParametrizedClass {
    public static void main(String[] args) {
       Info<String> info1 = new Info<>("hello");
        System.out.println(info1);
        Info<Integer> info2 = new Info<>(15);
        System.out.println(info2);



    }
}

class Info<T> {
    private T value;
    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }


}