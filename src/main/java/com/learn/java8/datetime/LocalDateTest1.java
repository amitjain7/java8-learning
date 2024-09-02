package com.learn.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTest1 {
    public static void main(String[] args) {
        LocalDate localDate= LocalDate.now();
        System.out.println(localDate.getYear());
        System.out.println(localDate.atStartOfDay());
        LocalDateTime lt=localDate.atStartOfDay();
        System.out.println(lt);
    }
}
