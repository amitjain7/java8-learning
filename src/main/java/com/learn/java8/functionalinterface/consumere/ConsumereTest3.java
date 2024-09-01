package com.learn.java8.functionalinterface.consumere;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumereTest3 {
    public static void main(String[] args) {
        // This is list of data
        List<Integer> myList= new ArrayList<>();
        myList.add(10);
        // Here we are passing consumer as a expression
        customForEach(myList,x-> System.out.println(x));
    }

    public static void customForEach(List<Integer> list,Consumer<Integer> consumere){
        for(Integer data:list){
            consumere.accept(data);
        }
    }
}
