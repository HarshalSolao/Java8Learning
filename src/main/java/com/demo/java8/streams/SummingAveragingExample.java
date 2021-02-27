package com.demo.java8.streams;

import com.demo.java8.functionalprograming.Instructor;
import com.demo.java8.functionalprograming.Instructors;

import java.util.stream.Collectors;

public class SummingAveragingExample {
    public static void main(String[] args) {
        //Sum of years of experience of all instructor
        int sum  = Instructors.getAll().stream()
                .collect(Collectors.summingInt(Instructor::getYearOfExperience));
        System.out.println("Sum =: " + sum);

        double average = Instructors.getAll().stream()
                .collect(Collectors.averagingInt(Instructor::getYearOfExperience));
        System.out.println("Average =: " + average);
    }
}
