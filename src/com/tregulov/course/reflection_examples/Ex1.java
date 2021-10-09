package com.tregulov.course.reflection_examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {

        Class employeeClass = Class.forName("com.tregulov.course.reflection_examples.Employee");
//        Class employeeClass2 = Employee.class;
//        Employee emp = new Employee();
//        Class employeeClass3 = emp.getClass();

//        Field someField = employeeClass.getField("id");
//        System.out.println("Type of id field = " + someField.getType());
//
//        Field[] fields = employeeClass.getFields();
//
//        for(Field field : fields) {
//            System.out.println("The name of the field is " + field.getName());
//            System.out.println("The type of the field is " + field.getType());
//        }
//        System.out.println("-------------------------");
//
//        Field[] allFields = employeeClass.getDeclaredFields();
//
//        for(Field field : allFields) {
//            System.out.println("The name of the field is " + field.getName());
//            System.out.println("The type of the field is " + field.getType());
//        }
//
//        Method someMethod1 = employeeClass.getMethod("increaseSalary");
//
//        System.out.println("Return type of method is " + someMethod1.getReturnType() + " parameter types = " + Arrays.toString(someMethod1.getParameterTypes()));
//
//        Method someMethod2 = employeeClass.getMethod("setSalary", double.class);
//
//        System.out.println("Return type of method is " + someMethod2.getReturnType() + " parameter types = " + Arrays.toString(someMethod2.getParameterTypes()));
//
//        Method[] methods = employeeClass.getMethods();
//        for(Method method : methods) {
//            System.out.println(method.getName() + " " + Arrays.toString(method.getParameterTypes()));
//        }
//
//        Method[] allMethods = employeeClass.getDeclaredMethods();
//        for(Method method : allMethods) {
//            System.out.println(method.getName() + " " + Arrays.toString(method.getParameterTypes()));
//        }

        Constructor constructor = employeeClass.getConstructor();
        System.out.println(constructor.getParameterCount());
        Constructor[] constructors = employeeClass.getConstructors();


    }
}
