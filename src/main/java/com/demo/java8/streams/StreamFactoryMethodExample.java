package com.demo.java8.streams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamFactoryMethodExample {
    public static void main(String[] args) {
        //Different way to create Streams
        //of
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        stream.forEach(System.out::println);
        System.out.println("--------------");

        //Iterate
        Stream<Integer> stream1 = Stream.iterate(0, i -> i + 2).limit(5);
        stream1.forEach(System.out::println);
        System.out.println("--------------");

        //generate
        Stream<Integer> stream2 = Stream.generate(new Random()::nextInt);
        stream2.forEach(System.out::println);

    }
}
