package com.demo.java8.functionalprograming;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
//        Consumer<String> con = (x) -> System.out.println(x.length() + " the value of x: " + x);
//        con.accept("Up in the air");
//
//        //Consumer block statement
//        Consumer<Integer> con1 = (x) -> {
//            System.out.println("x*x = " + x*x);
//            System.out.println("x/x = " + x/x);
//        };
//
//        con1.accept(24);



        Consumer<String> consumer = (y) ->{
            System.out.println(y+y+y);
        };

        consumer.accept("hi");
    }
}
