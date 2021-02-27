package com.demo.java8.streams;

import com.demo.java8.functionalprograming.Instructor;
import com.demo.java8.functionalprograming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        //Creating map of names and courses of instructors who teaches online and having
        //more than 10 years of experience

        Predicate<Instructor> p1 = (i) -> i.isOnlineCourses();
        Predicate<Instructor> p2 = (i) -> i.getYearOfExperience() > 10;

        List<Instructor> instructors = Instructors.getAll();

        Map<String,List<String>> map = instructors.stream()
                .filter(p1)
                .filter(p2)
                .collect(Collectors.toMap(Instructor::getName,Instructor::getCourses));

        System.out.println(map);


    }
}
