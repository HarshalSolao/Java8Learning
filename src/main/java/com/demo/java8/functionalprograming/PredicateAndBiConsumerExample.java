package com.demo.java8.functionalprograming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumerExample {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        //All instructor who teaches online
        Predicate<Instructor> predicate = (i) -> i.isOnlineCourses()==true;
        //Instructor  experience > 10
        Predicate<Instructor> predicate1 = (i) -> i.getYearOfExperience() > 10;

        //BiConsumer print name and courses
        BiConsumer<String, List<String>> biConsumer = (x,y) -> {
            System.out.println("Name : " + x + ", Courses  : " + y);
        };

        instructors.forEach(instructor -> {
            if(predicate.and(predicate1).test(instructor)){
                biConsumer.accept(instructor.getName(),instructor.getCourses());
            }
        });

    }
}
