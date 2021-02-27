package com.demo.java8.functionalprograming;

import java.util.function.*;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        //When input and return type is same type then use Unary operator instead of function
        UnaryOperator<Integer> unaryOperator = i -> i * 10;
        System.out.println(unaryOperator.apply(100));

        Function<Integer, Integer> function = i -> i * 10;
        System.out.println(function.apply(100));

        IntUnaryOperator intUnaryOperator = i -> i * 20;
        System.out.println(intUnaryOperator.applyAsInt(24));

        LongUnaryOperator longUnaryOperator = i -> i * 2311L;
        System.out.println(longUnaryOperator.applyAsLong(234L));

        DoubleUnaryOperator doubleUnaryOperator = i -> i * 24.24;
        System.out.println(doubleUnaryOperator.applyAsDouble(22.114444444444444444444));
    }
}
