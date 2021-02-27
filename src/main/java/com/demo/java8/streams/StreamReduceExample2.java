package com.demo.java8.streams;

import com.demo.java8.functionalprograming.Instructors;

import java.util.Optional;

public class StreamReduceExample2 {
    public static void main(String[] args) {
        //Printing the instructors who has highest years of experience
        Optional instructor = Instructors.getAll().stream()
                .reduce((s1,s2) -> s1.getYearOfExperience()> s2.getYearOfExperience()?s1:s2
                //{
//                    if(s1.getYearOfExperience() > s2.getYearOfExperience()){
//                        return s1;
//                    } else {
//                        return s2;
//                    }
                );

        if(instructor.isPresent()){
            System.out.println(instructor.get());
        }

    }
}
