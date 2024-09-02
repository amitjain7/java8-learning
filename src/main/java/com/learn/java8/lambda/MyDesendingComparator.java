package com.learn.java8.lambda;

import java.util.Comparator;

class MyDesendingComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer i1,Integer i2) {
        if(i1>i2){
            return -1;
        }
        else if(i1>i2){
            return +1;
        }
        else{
            return 0;
        }
    }
}