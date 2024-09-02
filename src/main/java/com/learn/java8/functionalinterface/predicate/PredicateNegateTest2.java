package com.learn.java8.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateNegateTest2 {
    public static void main(String[] args) {
        Predicate<String> validName=(x)->x.contains("Amit123");

        System.out.println(validName.test("Amit"));
       // System.out.println(validName.test("Amit123"));

        Predicate<String> newValidName=validName.negate();

        System.out.println(newValidName.test("Amit123"));
    }
}
