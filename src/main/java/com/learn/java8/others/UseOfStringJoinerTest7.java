package com.learn.java8.others;

import java.util.StringJoiner;

public class UseOfStringJoinerTest7 {
    public static void main(String[] args) {
        StringJoiner names=new StringJoiner("-");
        names.add(" Amit");
        names.add(" Raj");
        System.out.println(names);


        StringJoiner names2=new StringJoiner("-", "Welcome ", "!");
        names2.add("Amit");
        names2.add("Raj");
        System.out.println(names2);



    }
}
