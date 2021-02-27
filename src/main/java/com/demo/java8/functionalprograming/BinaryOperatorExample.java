package com.demo.java8.functionalprograming;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a,b) -> a+b;
        System.out.println(binaryOperator.apply(2,4));

        Comparator<Integer> comparator = (a,b) -> a.compareTo(b);
        BinaryOperator<Integer> maxBi = BinaryOperator.maxBy(comparator);
        BinaryOperator<Integer> minBi = BinaryOperator.minBy(comparator);

        System.out.println(maxBi.apply(7,8));
        System.out.println(minBi.apply(7,8));

        IntBinaryOperator intBinaryOperator = (a,b) -> a*b;
        System.out.println(intBinaryOperator.applyAsInt(2,4));

        LongBinaryOperator longBinaryOperator = (a,b) -> a*b;
        System.out.println(longBinaryOperator.applyAsLong(2311L,898L));

        DoubleBinaryOperator doubleBinaryOperator = (a,b) -> a*b;
        System.out.println(doubleBinaryOperator.applyAsDouble(4544,8689.88));
    }
}
