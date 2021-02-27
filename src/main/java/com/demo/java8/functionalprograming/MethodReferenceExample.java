package com.demo.java8.functionalprograming;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> pePredicate = instructor -> instructor.isOnlineCourses();
        Predicate<Instructor> predicate = Instructor::isOnlineCourses;

        Function<Integer,Double> function = n -> Math.sqrt(n);
        Function<Integer, Double> function1 = Math::sqrt;

        Function<String, String> lowerCaseFunction = s1 -> s1.toLowerCase();
        Function<String, String> lowerCaseFunction1 = String::toLowerCase;

    }

}
