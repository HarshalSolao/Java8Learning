package com.demo.java8.functionalprograming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    public static void main(String[] args) {
        //Bifunction 2 input List<Instructor> and second is predicate which will filter if instructor has online
        //courses and return a map of <String, Integer> string is name and integer is the year of experience

        Predicate<Instructor> predicate = (s) -> s.isOnlineCourses()==true;

        BiFunction<List<Instructor>, Predicate<Instructor>, Map<String, Integer>> mapBiFunction = ((instructors, instructorPredicate) -> {
            Map<String, Integer> map = new HashMap<>();
            instructors.forEach(instructor -> {
                if(instructorPredicate.test(instructor)){
                    map.put(instructor.getName(), instructor.getYearOfExperience());
                }
            });
            return map;
        });

        System.out.println(mapBiFunction.apply(Instructors.getAll(),predicate));
        System.out.println("-----------------------------");
        //Now changing predicate only
        Predicate<Instructor> predicate1 = (s) -> s.getCourses().contains("Java");
        System.out.println(mapBiFunction.apply(Instructors.getAll(),predicate1));

    }
}
