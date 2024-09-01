package com.learn.java8.functionalinterface.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest3 {
    public static void main(String[] args) {
        // Directly passing supplier in method
        getInfo(()-> {
            List<String> myList=new ArrayList<>();
            myList.add("Amit");
            myList.add("Amit1");
            myList.add("Amit2");
            myList.add("Amit3");
            return myList;
        });
    }
    public static void getInfo(Supplier<List<String>> supplier){
        for(String name: supplier.get()){
            System.out.println(name);
        }
    }

}
