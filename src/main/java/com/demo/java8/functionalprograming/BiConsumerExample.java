package com.demo.java8.functionalprograming;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        //Printing two numbers
        BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println("X : " + x + ", Y : " + y);
        biConsumer.accept(10, 24);
        //Sum of twi integer
        BiConsumer<Integer, Integer> biConsumer1 = (x, y) -> System.out.println("X + Y : " + (x + y));
        biConsumer1.accept(66, 76);
        //Concatenate Strings
        BiConsumer<String, String> biConsumer2 = (x, y) -> System.out.println(x + y);
        biConsumer2.accept("Harshal ", "Solao");
    }
}
