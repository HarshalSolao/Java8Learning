package com.demo.java8.functionalprograming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample2 {
    public static void main(String[] args) {
        //Map of instructor with name and year of experience
        //Function which will List<Instructor>  and return a Map<String, Integer>

        //Predicate return true if instructor has online courses

        Predicate<Instructor> predicate = (i) -> i.isOnlineCourses() == true;
//        Function<List<Instructor>, Map<String,Integer>> mapFunction = (instructors -> {
//            Map<String,Integer> map =  new HashMap<>();
//            instructors.forEach(instructor -> {
//                if(predicate.test(instructor))
//                map.put(instructor.getName(),instructor.getYearOfExperience());
//            });
//            return map;
//        });





        Function<List<Instructor>,Map<String,Integer>> fun = (instructors) -> {
           Map<String,Integer> map = new HashMap<>();
            instructors.forEach(instructor ->{
                if(predicate.test(instructor)){
                    map.put(instructor.getName(),instructor.getYearOfExperience());
                }
                    }

            );
           return map;
        };














        System.out.println(fun.apply(Instructors.getAll()));
    }
}
