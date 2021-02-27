package com.demo.java8.functionalprograming;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        //Print out name and gender of instructor
        BiConsumer<String, String> biConsumer = (name,gender) -> System.out.println("Name : " + name + ", Gender : " + gender);
        instructors.forEach(instructor -> biConsumer.accept(instructor.getName(),instructor.getGender()));
        System.out.println("---------------------------");

        //Print out name and courses of instructor
        BiConsumer<String, List<String>> biConsumer1 = (name,courses) -> System.out.println("Name : " + name + ", Courses : " + courses);
        instructors.forEach(instructor -> biConsumer1.accept(instructor.getName(),instructor.getCourses()));
        System.out.println("---------------------------");

        //Print out name and gender of instructor who teaches online
        instructors.forEach(instructor -> {
            if(instructor.isOnlineCourses())
                biConsumer.accept(instructor.getName(),instructor.getGender());
        });
    }
}
