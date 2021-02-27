package com.demo.java8.streams;

import com.demo.java8.functionalprograming.Instructor;
import com.demo.java8.functionalprograming.Instructors;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinByMaxByExample {
    public static void main(String[] args) {
        //Instructor with minimum year of experience
        Optional<Instructor> instructor = Instructors.getAll().stream()
                .collect(Collectors.minBy(Comparator.comparing(Instructor::getYearOfExperience)));
        System.out.println("Instructors : " + instructor);

        System.out.println("-----------");

        instructor = Instructors.getAll().stream()
                .min(Comparator.comparing(Instructor::getYearOfExperience));
        System.out.println("Instructors : " + instructor);
        System.out.println("-----------");
        instructor = Instructors.getAll().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Instructor::getYearOfExperience)));
        System.out.println("Instructors : " + instructor);

        System.out.println("-----------");

        instructor = Instructors.getAll().stream()
                .max(Comparator.comparing(Instructor::getYearOfExperience));
        System.out.println("Instructors : " + instructor);
    }
}
