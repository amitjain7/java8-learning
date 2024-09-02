package com.learn.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortUsingLambdaComparator {
    public static void main(String[] args) {
        List<Integer> intList=new ArrayList<>();
        intList.add(100);
        intList.add(1);
        intList.add(50);
        intList.add(40);
        System.out.println("Before Sort - "+intList);
        Collections.sort(intList,(i1,i2)->(i1>i2)?-1:(i1<i2)?+1:0);
        System.out.println("After Sort - "+intList);
    }
}
