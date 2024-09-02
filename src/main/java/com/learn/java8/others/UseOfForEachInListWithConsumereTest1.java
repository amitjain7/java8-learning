package com.learn.java8.others;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class UseOfForEachInListWithConsumereTest1 {

    public static void main(String[] args) {
        List<Integer> intList=new ArrayList<>();
        intList.add(100);
        intList.add(1);
        intList.add(50);
        intList.add(40);

        MyConsumere myConsumere= new MyConsumere();
        intList.forEach(myConsumere);
    }
}

 class MyConsumere implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
        System.out.println("Value is - "+integer);
    }
}
