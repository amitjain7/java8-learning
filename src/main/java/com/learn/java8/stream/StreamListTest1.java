package com.learn.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListTest1 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Amit12");
        names.add("Amit1");
        names.add("Amit2");
        names.add("Amit5");
        names.add("Amit3");
        names.add("Amit2");
        List<String> newList=names.stream()
                .filter((x)->{
                            System.out.println("inside filter");
                        return x.contains("Amit5");
                }
                )
                .map((x)-> {
                    System.out.println("First map Before Update -> "+x);
                    String newdata= x.concat(" Jain");
                    System.out.println("First map After Update -> "+newdata);
                    return newdata;
                })
                .map((x)-> {
                    System.out.println("Second map Before Update -> "+x);
                    String newdata= x.concat(" Good Jain");
                    System.out.println("Second map After Update -> "+newdata);
                    return newdata;
                })
                //.max((e1,e2)->-e1.compareTo(e2))
                //.get();
               .collect(Collectors.toList());
                //.forEach(System.out::println);

        System.out.println(newList);


    }
}
