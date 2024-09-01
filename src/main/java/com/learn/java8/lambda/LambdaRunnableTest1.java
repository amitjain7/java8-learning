package com.learn.java8.lambda;

public class LambdaRunnableTest1 {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("Hi");
        };

        Thread t=new Thread(r);
        t.start();
    }
}
