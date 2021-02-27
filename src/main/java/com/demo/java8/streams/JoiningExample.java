package com.demo.java8.streams;

import com.demo.java8.functionalprograming.Instructor;
import com.demo.java8.functionalprograming.Instructors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {
    public static void main(String[] args) {
        String result = Stream.of("E", "F", "H", "k", "l").collect(Collectors.joining());
        System.out.println(result);

        result = Stream.of("E", "F", "H", "k", "l").collect(Collectors.joining(","));
        System.out.println(result);

        result = Stream.of("E", "F", "H", "k", "l").collect(Collectors.joining(",", "{", "} "));
        System.out.println(result);

        //instructor name seperated by ' prefix "{" and suffix  "}"
        String nameConcatanated = Instructors.getAll().stream()
                .map(Instructor::getName)
                .collect(Collectors.joining(",", "{", "}"));

        System.out.println("nameConcatanated : " + nameConcatanated);

        String str = Instructors.getAll().stream().map(Instructor::getTitle).collect(Collectors.joining(","));
        System.out.println(str);

    }
}
