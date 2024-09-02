package com.learn.java8.lambda;

import java.util.Comparator;

public class MyAssendingComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer i1,Integer i2) {
        System.out.println("i1 => "+i1 +" :: i2 => "+i2);
        int returnVal=0;
        if(i1>i2){
            returnVal= +1;
        }
        else if(i1<i2){
            returnVal= -1;
        }
        else{
            returnVal= 0;
        }
        System.out.println("Return Value => "+returnVal);
        System.out.println("------------------------------");
        return returnVal;
    }
}
