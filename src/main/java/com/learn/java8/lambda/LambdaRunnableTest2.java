package com.learn.java8.lambda;

public class LambdaRunnableTest2 {
    public static void main(String[] args) {
        new Thread(() ->System.out.println("Hi")).start();
    }
}
