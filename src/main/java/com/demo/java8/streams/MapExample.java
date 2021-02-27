package com.demo.java8.streams;

import com.demo.java8.functionalprograming.Instructor;
import com.demo.java8.functionalprograming.Instructors;

import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        //Returns only name from the list

        List<Instructor> instructors = Instructors.getAll();

        List<String> list = instructors.stream()
                .map(Instructor::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
