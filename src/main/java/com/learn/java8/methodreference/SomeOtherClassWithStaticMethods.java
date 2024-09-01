package com.learn.java8.methodreference;

public class SomeOtherClassWithStaticMethods {

    public static void someOtherStaticMethod1(){
        System.out.println("Some other static methods 1");
    }

    public static String someOtherStaticMethod2(){
        System.out.println("Some other static methods 2");
        return "aa";
    }

    public static void someOtherStaticMethod3(){
        System.out.println("Start static someOtherMethod3 -" +Thread.currentThread());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End static someOtherMethod3 -" +Thread.currentThread());
    }

    public static String someOtherStaticMethod4(){
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
