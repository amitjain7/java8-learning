package com.learn.java8.constructorreference;

public class MyInterfaceImplementUsingConstructorReference {
    public static void main(String[] args) {
        MyInterface myInterface = MyClass::new;
        myInterface.getMyClass().printName();
    }
}
