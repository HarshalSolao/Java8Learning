package com.demo.java8.streams;

import com.demo.java8.functionalprograming.Instructor;
import com.demo.java8.functionalprograming.Instructors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupingByExample1 {
    public static void main(String[] args) {
        //Group list of name by there length
        List<String> names = Arrays.asList("Harshal","Jenny", "Gene","John","Rajeev");
        Map<Integer, List<String>> result = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Result = " + result);
        System.out.println("------------------");
        //Grouping instructors by gender
        Map<String, List<Instructor>> instructorByGender = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getGender));

        instructorByGender.forEach((k,v) -> {
            System.out.println("Key :" + k + " Value :" + v);
        });
        System.out.println("------------------");

        //Grouping by experience where > 10 years of experience id classified
        //as Senior and others are Junior
        Map<String, List<Instructor>> instructorsByExperience = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(instructor -> instructor.getYearOfExperience() > 10 ? "SENIOR" : "JUNIOR"));
        instructorsByExperience.forEach((k,v) -> {
            System.out.println("Key = " + k + " Value = " + v);
        });


    }
}
