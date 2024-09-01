package com.learn.java8.functionalinterface.consumere;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumereTest2 {
    public static void main(String[] args) {
        // This is list of data
        List<Integer> myList= new ArrayList<>();
        myList.add(10);

        // How to process the data, it will not return anything
        Consumer<Integer> consumere= x-> System.out.println(x);

        customForEach(myList,consumere);
    }

    public static void customForEach(List<Integer> list,Consumer<Integer> consumere){
        for(Integer data:list){
            consumere.accept(data);
        }
    }
}
