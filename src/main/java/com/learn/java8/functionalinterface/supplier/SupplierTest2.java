package com.learn.java8.functionalinterface.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest2 {
    public static void main(String[] args) {
        Supplier<List<String>> supplier = ()-> {
            List<String> myList=new ArrayList<>();
            myList.add("Amit");
            myList.add("Amit1");
            myList.add("Amit2");
            myList.add("Amit3");
            return myList;
        };


        for(String name: supplier.get()){
            System.out.println(name);
        }
    }
}
