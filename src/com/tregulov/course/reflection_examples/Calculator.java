package com.tregulov.course.reflection_examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {
    void sum(int a, int b) {
        int result = a+b;
        System.out.println("Sum of" + a + " and " + b + " = " + result);
    }
    void subtraction(int a, int b) {
        int result = a-b;
        System.out.println("subtraction of" + a + " and " + b + " = " + result);
    }
    void multiplication(int a, int b) {
        int result = a*b;
        System.out.println("multiplication of" + a + " and " + b + " = " + result);
    }
    void division(int a, int b) {
        int result = a/b;
        System.out.println("division of" + a + " and " + b + " = " + result);
    }
}

class TestCalculator {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("test100.txt"))){
            String methodName = reader.readLine();
            String firstArg = reader.readLine();
            String secondArg = reader.readLine();

            Calculator calculator = new Calculator();
            Class cl = calculator.getClass();
            Method method = null;

            Method[] declaredMethods = cl.getDeclaredMethods();

            for(Method myMethod: declaredMethods) {
                if (myMethod.getName().equals(methodName)) {
                    method = myMethod;
                }
            }

            method.invoke(calculator, Integer.parseInt(firstArg), Integer.parseInt(secondArg));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}

