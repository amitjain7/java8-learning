package com.learn.java8.functionalinterface.function;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<String,Integer> myFunc=(data)->data.length();

        System.out.println(myFunc.apply("Amit"));
    }
}
