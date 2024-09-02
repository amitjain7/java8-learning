package com.learn.java8.functionalinterface.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateNameStartWithK {
    public static void main(String[] args) {
        Predicate<String> nameStartWithK=name->name.startsWith("K");

        List<String> names=new ArrayList<>();
        names.add("Amit");
        names.add("Kirti");
        names.add("Kumari");
        names.add("Archna");

        for(String name:names){
            if(nameStartWithK.test(name)){
                System.out.println(name);
            }

        }
    }
}
