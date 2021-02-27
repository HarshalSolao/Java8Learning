package com.demo.java8.functionalprograming;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateExample3 {
    public static void main(String[] args) {
        IntPredicate intPredicate = (i) -> i>100;
        System.out.println(intPredicate.test(122));

        LongPredicate longPredicate = (i) -> i>100L;
        System.out.println(longPredicate.test(1234L));

        DoublePredicate doublePredicate = (i) -> i>100.43D;
        System.out.println(doublePredicate.test(1938D));
    }
}
