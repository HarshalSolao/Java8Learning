package com.demo.java8.lambda;

@FunctionalInterface
public interface IncrementByFive {
    public int incrementByFive(int a);

    default void show(){
        System.out.println("default");
    }

    static void show1(){
        System.out.println("static");
    }
}
