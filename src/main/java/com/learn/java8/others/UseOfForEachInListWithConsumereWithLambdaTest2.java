package com.learn.java8.others;

import java.util.ArrayList;
import java.util.List;

public class UseOfForEachInListWithConsumereWithLambdaTest2 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(100);
        intList.add(1);
        intList.add(50);
        intList.add(40);
        intList.forEach(i-> System.out.println("Value is - "+i));

    }
}
