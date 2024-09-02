package com.learn.java8.datetime;

import java.time.LocalDateTime;

public class LocalDateTimeTest2 {
    public static void main(String[] args) {
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime.getHour());
    }
}
