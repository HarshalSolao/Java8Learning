package com.demo.java8.functionalprograming;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Double> sqrt = n -> Math.sqrt(n);
        System.out.println("Square root of 64: " + sqrt.apply(64));
        System.out.println("Square root of 64: " + sqrt.apply(80));

        Function<String, String> lowerCase = (s) -> s.toLowerCase();
        System.out.println("Lower case is : " + lowerCase.apply("PROGRAMMING"));

        Function<String, String> cancatFunction = (s) -> s.concat("In Java");
        System.out.println(lowerCase.andThen(cancatFunction).apply("PROGRAMMING "));

        //Compose will be applied at the end
        System.out.println(lowerCase.compose(cancatFunction).apply("PROGRAMMING "));
    }
}
