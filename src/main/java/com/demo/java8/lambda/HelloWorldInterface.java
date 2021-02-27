package com.demo.java8.lambda;
public interface HelloWorldInterface {

    //public String sayHelloWorld();
    default void show(){
        System.out.println("hello");
    };
}
