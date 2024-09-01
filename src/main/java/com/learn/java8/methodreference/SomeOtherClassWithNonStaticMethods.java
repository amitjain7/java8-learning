package com.learn.java8.methodreference;

public class SomeOtherClassWithNonStaticMethods {

    public  void someOtherMethod1(){
        System.out.println("Some other non-static methods 1");
    }

    public  String someOtherMethod2(){
        System.out.println("Some other non-static methods 2");
        return "aa";
    }

    public  void someOtherMethod3(){
        System.out.println("Start non-static someOtherMethod3 -" +Thread.currentThread());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End non-static someOtherMethod3 -" +Thread.currentThread());
    }

    public  String someOtherMethod4(){
        System.out.println("Start someOtherMethod4 -" +Thread.currentThread());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End someOtherMethod4 -" +Thread.currentThread());
        return "Amit";
    }
}
