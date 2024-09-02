package com.learn.java8.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateTest1 {
    public static void main(String[] args) {
        Predicate<String> validName=(x)->x.contains("Amit123");

        System.out.println(validName.test("Amit"));
        System.out.println(validName.test("Amit123"));

    }
}
