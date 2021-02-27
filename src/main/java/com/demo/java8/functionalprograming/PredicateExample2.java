package com.demo.java8.functionalprograming;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        //All teachers who teaches online
        Predicate<Instructor> predicate = (i) -> i.isOnlineCourses() == true;

        //Instructor year of experience is > 10
        Predicate<Instructor> predicate1 = (i) -> i.getYearOfExperience() > 10;

        instructors.forEach(instructor -> {
            if(predicate.test(instructor)){
                System.out.println(instructor);
            }
        });
        System.out.println("---------------------");
        instructors.forEach(instructor -> {
            if(predicate1.test(instructor)){
                System.out.println(instructor);
            }
        });
        System.out.println("---------------------");
        //Instructor teaches online and experience is > 10
        instructors.forEach(instructor -> {
            if(predicate.and(predicate1).test(instructor)){
                System.out.println(instructor);
            }
        });


    }
}
