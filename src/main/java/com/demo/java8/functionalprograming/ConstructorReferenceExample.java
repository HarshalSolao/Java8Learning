package com.demo.java8.functionalprograming;

import java.util.Arrays;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        InstructorFactory instructorFactory = Instructor::new;
        Instructor instructor = instructorFactory.getInstructor("Mike",10,"SD", "Male",true, Arrays.asList("Java","CPP"));

        System.out.println(instructor);
    }
}
