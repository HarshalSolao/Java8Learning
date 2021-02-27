package com.demo.java8.streams;

import com.demo.java8.functionalprograming.Instructor;
import com.demo.java8.functionalprograming.Instructors;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        //Get a list of courses which offers by Instructors

        List<String> list = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
