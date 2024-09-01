package com.learn.java8.constructorreference;

public class MyInterfaceImplementUsingLambda {
    public static void main(String[] args) {
        MyInterface myInterface = ()-> new MyClass();
        myInterface.getMyClass().printName();
    }
}
