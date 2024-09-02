package com.learn.java8.others;

import java.util.Optional;

public class UseOfOptionalClassTest9 {
    public static void main(String[] args) {
      //  String[] str=new String[4];
      //  String data=str[3].substring(4);
       // System.out.println(data);

        String[] str123=new String[4];
        Optional<String> data123= Optional.ofNullable(str123[3]);
        if(data123.isPresent()){
            String data456 =str123[3].substring(4);
            System.out.println(data456);
        }
        else{
            System.out.println("Data not present on index 3");
        }
    }
}
