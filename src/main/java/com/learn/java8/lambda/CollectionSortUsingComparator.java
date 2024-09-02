package com.learn.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSortUsingComparator {

    public static void main(String[] args) {
        List<Integer> intList=new ArrayList<>();
        intList.add(100);
        intList.add(1);
        intList.add(50);
        intList.add(40);
        System.out.println("Before Sort - "+intList);
        Collections.sort(intList,new MyAssendingComparator());
        System.out.println("After Sort - "+intList);
    }




}
