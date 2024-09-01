package com.learn.java8.methodininterface;

public class DefaultMethodInInterfaceImplementation implements  DefaultMethodInInterface{
    public static void main(String[] args) {
        DefaultMethodInInterfaceImplementation defaultMethodInInterfaceImplementation=new DefaultMethodInInterfaceImplementation();
        String name=defaultMethodInInterfaceImplementation.getName();
        System.out.println(name);
    }
}
