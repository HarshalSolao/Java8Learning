package com.demo.java8.streams;

import com.demo.java8.functionalprograming.Instructor;
import com.demo.java8.functionalprograming.Instructors;

import java.util.stream.Collectors;

public class CountingExample {
    public static void main(String[] args) {
        //count no of instructor who teaches online course
        long count = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourses)
                .count();
        System.out.println(count);

        count = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourses)
                .collect(Collectors.counting());
        System.out.println("count : "+count);

        //This will not work as map return always all instructors need to use filter
        long females = Instructors.getAll().stream().map(i -> i.getGender().equalsIgnoreCase("female")).count();
        System.out.println(females);
    }
}
