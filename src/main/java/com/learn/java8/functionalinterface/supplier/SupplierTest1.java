package com.learn.java8.functionalinterface.supplier;

import java.util.function.Supplier;

public class SupplierTest1 {
    public static void main(String[] args) {
        Supplier<String> supplier = ()->  "Amit";

        System.out.println(supplier.get());
    }
}
