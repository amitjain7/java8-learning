package com.learn.java8.others;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UseOfCollectorsForGroupingTest4 {
    public static void main(String[] args) {
        List<String> studentNames=
                Arrays.asList("Amit","Raj","Karan","Amit","Karan");

        Map<String,Long> groupData= studentNames.stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));

        groupData.forEach((name,count)-> System.out.println("name- "+name+" :: count-"+count));


    }
}
