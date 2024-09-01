package com.learn.java8.methodreference;


public class RunnableImplementationUsingMethodReferenceTest {
    public static void main(String[] args) {
        System.out.println("Main Start -"+Thread.currentThread());
        Runnable runnable1= SomeOtherClassWithStaticMethods::someOtherStaticMethod3;
        new Thread(runnable1).start();

        //Someotherclass method returnning something but no impact
        Runnable runnable2= SomeOtherClassWithStaticMethods::someOtherStaticMethod4;
        new Thread(runnable2).start();

        SomeOtherClassWithNonStaticMethods someOtherClassWithNonStaticMethods=new SomeOtherClassWithNonStaticMethods();

        Runnable runnable3= someOtherClassWithNonStaticMethods::someOtherMethod3;
        new Thread(runnable3).start();

        //Someotherclass method returnning something but no impact
        Runnable runnable4= someOtherClassWithNonStaticMethods::someOtherMethod4;
        new Thread(runnable4).start();

        System.out.println("Main End -"+Thread.currentThread());
    }
}
