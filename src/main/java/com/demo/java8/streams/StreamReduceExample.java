package com.demo.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList();
        int results = numbers.stream()
                //0 + 1 = 1
                //1 + 2 = 3
                //3 + 3 = 6
                .reduce(0, (a,b) -> a+b);
        System.out.println(results);
        int resultMul = numbers.stream()
                .reduce(1,(a,b) -> a*b);
        System.out.println(resultMul);
        System.out.println("-------------");
        Optional resultOp = numbers.stream()
                .reduce((a,b) -> a+b);
        if(resultOp.isPresent()){
            System.out.println(resultOp.get()); //Exception will throw if no value present so need to check first
        }

    }
}
