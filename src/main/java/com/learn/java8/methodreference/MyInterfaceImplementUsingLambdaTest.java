package com.learn.java8.methodreference;



public class MyInterfaceImplementUsingLambdaTest {
    public static void main(String[] args) {
        MyInterface myInterface = () -> {
            System.out.println("Hi");
        };
        myInterface.m1();

    }
}
