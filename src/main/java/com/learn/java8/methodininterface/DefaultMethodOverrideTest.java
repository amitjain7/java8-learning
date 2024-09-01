package com.learn.java8.methodininterface;

public class DefaultMethodOverrideTest implements DefaultMethodInInterface{
    public String getName(){
        return "Override version of Amit";
    }

    public static void main(String[] args) {
        DefaultMethodOverrideTest defaultMethodOverrideTest=new DefaultMethodOverrideTest();
        String name=defaultMethodOverrideTest.getName();
        System.out.println(name);
    }
}
