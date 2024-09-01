package com.learn.java8.methodreference;

public class MyInterfacemplementUsingMethodReferenceTest {
    public static void main(String[] args) {
        MyInterface myInterface1 = SomeOtherClassWithStaticMethods::someOtherStaticMethod1;
        myInterface1.m1();

        // SomeOther class method returning something but no issue
        MyInterface myInterface2 = SomeOtherClassWithStaticMethods::someOtherStaticMethod2;
        myInterface2.m1();

        SomeOtherClassWithNonStaticMethods someOtherClassWithNonStaticMethods=new SomeOtherClassWithNonStaticMethods();

        MyInterface myInterface3 = someOtherClassWithNonStaticMethods::someOtherMethod1;
        myInterface3.m1();

        // SomeOther class method returning something but no issue
        MyInterface myInterface4 = someOtherClassWithNonStaticMethods::someOtherMethod2;
        myInterface4.m1();

    }
}
