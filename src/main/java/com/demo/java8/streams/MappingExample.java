package com.demo.java8.streams;

import com.demo.java8.functionalprograming.Instructor;
import com.demo.java8.functionalprograming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MappingExample {
    public static void main(String[] args) {

        //Map
        List<String> nameList = Instructors.getAll().stream()
                .map(Instructor::getName)
                .collect(Collectors.toList());

        nameList.forEach(System.out::println);
        System.out.println("-----------------");

        //Mapping
        nameList = Instructors.getAll().stream()
                .collect(Collectors.mapping(Instructor::getName,Collectors.toList()));
        nameList.forEach(System.out::println);
        System.out.println("-----------------");
        //Instructors by their years of experience
        Map<Integer,List<String>> mapOfYearOfExperienceAndNames = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getYearOfExperience,Collectors.mapping(Instructor::getName,Collectors.toList())));

        mapOfYearOfExperienceAndNames.forEach((k,v) -> {
            System.out.println("Year of Experience : " + k + ", & Names : " + v);
        });
    }
}
