package com.demo.java8.streams;

import com.demo.java8.functionalprograming.Instructor;
import com.demo.java8.functionalprograming.Instructors;

public class StreamMapFilterReduceExample {
    public static void main(String[] args) {
        //Total years of experience b/w instructors
       int result =  Instructors.getAll().stream()
               .filter((i) -> i.isOnlineCourses())  //Extra filter
                .map(Instructor::getYearOfExperience)
                .reduce(0,Integer::sum);    //(a,b) -> a+b;

        System.out.println(result);


    }
}
