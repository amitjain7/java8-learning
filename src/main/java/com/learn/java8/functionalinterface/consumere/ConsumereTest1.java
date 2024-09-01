package com.learn.java8.functionalinterface.consumere;

import java.util.function.Consumer;

public class ConsumereTest1 {
    public static void main(String[] args) {
        Consumer<String> consumere = (x) -> {
            System.out.println(x);
        };

        consumere.accept("Hi Amit");

    }

}
