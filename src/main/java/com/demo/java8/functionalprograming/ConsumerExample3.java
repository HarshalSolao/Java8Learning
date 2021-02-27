package com.demo.java8.functionalprograming;

import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerExample3 {
    public static void main(String[] args) {
        IntConsumer intConsumer = (x) -> System.out.println(x*10);
        intConsumer.accept(10);

        LongConsumer longConsumer = (x) -> System.out.println(x*10L);
        longConsumer.accept(199L);
    }
}
