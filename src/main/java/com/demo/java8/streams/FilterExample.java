package com.demo.java8.streams;

import com.demo.java8.functionalprograming.Instructor;
import com.demo.java8.functionalprograming.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        //Return instructors sorted by there name and having more than 10 years of experience
        List<Instructor> list = Instructors.getAll().stream()
                .filter(i -> i.getYearOfExperience() > 10)
                .sorted(Comparator.comparing(Instructor::getName))
                .collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}
