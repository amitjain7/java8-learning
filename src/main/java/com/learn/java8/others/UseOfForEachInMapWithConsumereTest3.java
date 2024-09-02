package com.learn.java8.others;

import java.util.HashMap;
import java.util.Map;

public class UseOfForEachInMapWithConsumereTest3 {
    public static void main(String[] args) {
        Map<Integer,String> data=new HashMap<>();
        data.put(1,"Amit");
        data.put(2,"Amit123");
        data.put(3,"Amit456");
        data.forEach((empNo,empName)->
                System.out.println("EmpNo- "+empNo+" :: EmpName - "+empName));

    }
}
