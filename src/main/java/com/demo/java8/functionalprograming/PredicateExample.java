package com.demo.java8.functionalprograming;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        //If number is > 10 return true
        Predicate<Integer> predicate = (i) -> i >10;
        System.out.println(predicate.test(199));


        //If number is > 10 and number is even return true
        Predicate<Integer> predicate1 = (i) -> i%2 == 0;
        System.out.println(predicate.and(predicate1).test(21));

        //If number is > 10 or number is even return true
        System.out.println(predicate.or(predicate1).test(21));

        //i>10 and i%2 != 0
        System.out.println(predicate.and(predicate1.negate()).test(21));
    }
}
