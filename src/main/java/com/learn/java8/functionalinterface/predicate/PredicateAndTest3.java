package com.learn.java8.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateAndTest3 {
    public static void main(String[] args) {

        Predicate<String> p1=(x)->x.contains("Amit");
        Predicate<String> p2=(x)->x.contains("Jain");
        Predicate<String> p3=p1.and(p2);

        System.out.println(p3.test("Hello Amit Ja1in"));
        System.out.println(p3.test("Hello Amit Ja1in"));

    }
}
