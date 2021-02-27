package com.demo.java8.functionalprograming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        //BiPredicate
        BiPredicate<Boolean, Integer> biPredicate = (online,experience) -> online==true && experience>10;
        //BiConsumer
        BiConsumer<String, List<String>> biConsumer1 = (name,courses) -> System.out.println("Name : " + name + ", Courses : " + courses);

        instructors.forEach(instructor -> {
            if(biPredicate.test(instructor.isOnlineCourses(),instructor.getYearOfExperience())){
                biConsumer1.accept(instructor.getName(),instructor.getCourses());
            }
        });
        System.out.println("--------------------------------");

    }
}
