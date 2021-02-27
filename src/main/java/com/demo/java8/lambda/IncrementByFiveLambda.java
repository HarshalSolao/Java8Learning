package com.demo.java8.lambda;

public class IncrementByFiveLambda {

    public static void main(String[] args) {

        IncrementByFive inc = (a) -> a + 5;

        System.out.println(inc.incrementByFive(6));
    }
}
