package com.learn.java8.lambda;

public class RunableImplementationUsingLambdaArgument {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("Start "+Thread.currentThread());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("End "+Thread.currentThread());
        }).start();
    }
}
