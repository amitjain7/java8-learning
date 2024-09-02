package com.learn.java8.others;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseOfCollectorsForGetListTest4 {
    public static void main(String[] args) {
        List<String> studentNames=
                Arrays.asList("Amit","Raj","Karan","Amit","Karan");
        List<String> studentNamesUpdated=studentNames.stream()
                .map(name->name+"123")
                .collect(Collectors.toList());
        studentNamesUpdated.forEach(data-> System.out.println(data));
    }
}
