package com.learn.java8.lambda;

public class RunableImplementationUsingAnonymousInnerClass {
    public static void main(String[] args) {
        System.out.println("Start Main "+Thread.currentThread());
        Runnable r=new Runnable(){
            @Override
            public void run() {
                System.out.println("Start "+Thread.currentThread());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("End "+Thread.currentThread());
            }
        };
        Thread t=new Thread(r);
        t.start();

        System.out.println("End Main "+Thread.currentThread());
    }
}
