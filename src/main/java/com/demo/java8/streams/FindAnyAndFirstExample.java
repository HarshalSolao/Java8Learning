package com.demo.java8.streams;

import com.demo.java8.functionalprograming.Instructor;
import com.demo.java8.functionalprograming.Instructors;

import java.util.Optional;

public class FindAnyAndFirstExample {
    public static void main(String[] args) {
       Optional<Instructor> optionalInstructor= Instructors.getAll().stream()
               //.filter(i -> i.getYearOfExperience() < 8)
               .findAny();
       if(optionalInstructor.isPresent())
           System.out.println(optionalInstructor.get());

        Optional<Instructor> optionalInstructor2= Instructors.getAll().stream().findFirst();
        if(optionalInstructor2.isPresent())
            System.out.println(optionalInstructor2.get());
    }
}
