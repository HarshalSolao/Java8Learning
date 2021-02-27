package com.demo.java8.streams;

import com.demo.java8.functionalprograming.Instructor;
import com.demo.java8.functionalprograming.Instructors;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsOperations {
    public static void main(String[] args) {
        //Count
        Long count = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .count();

        System.out.println(count);

        //anyMatch, allMatch, noneMatch
        //Courses start with j

        //Count
        boolean match = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                //.anyMatch(i -> i.startsWith("J"));
                //.allMatch(i -> i.startsWith("J"));
                .noneMatch(i -> i.startsWith("j"));

        System.out.println(match);
    }
}
