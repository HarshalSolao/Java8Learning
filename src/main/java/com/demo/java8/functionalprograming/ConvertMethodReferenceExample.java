package com.demo.java8.functionalprograming;

import java.util.function.Predicate;

public class ConvertMethodReferenceExample {

    public static void main(String[] args) {
        Predicate<Instructor> predicate1 = ConvertMethodReferenceExample::greaterThanTenYearsOfExperience;

        Instructors.getAll().forEach(instructor -> {
            if(predicate1.test(instructor)){
                System.out.println(instructor);
            }
        });
    }

    public static boolean greaterThanTenYearsOfExperience(Instructor instructor){
        if(instructor.getYearOfExperience() > 10)
            return true;
        return false;
    }
}
