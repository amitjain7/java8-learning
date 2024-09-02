package com.learn.java8.others;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UseOfCollectorsForGetSetTest5 {
    public static void main(String[] args) {
        List<String> studentNames=
                Arrays.asList("Amit","Raj","Karan","Amit","Karan");
        Set<String> studentNamesUpdated=studentNames.stream()
                .map(name->name+"123")
                .collect(Collectors.toSet());
        studentNamesUpdated.forEach(data-> System.out.println(data));
    }
}
