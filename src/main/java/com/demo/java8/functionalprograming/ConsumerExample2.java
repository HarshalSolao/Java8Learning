package com.demo.java8.functionalprograming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        //Looping through all the instructors and printing out all the values
        Consumer<Instructor> consumer = (x) -> System.out.println(x);
        instructors.forEach(consumer); //Foreach contain accept method call
        System.out.println("------------------------------");

        //Looping through all the instructors and printing out all the name
        Consumer<Instructor> consumer1 = (x) -> System.out.println(x.getName());
        instructors.forEach(consumer1); //Foreach contain accept method call
        System.out.println("------------------------------");

        //Looping through all the instructors and printing out all the name & courses
        Consumer<Instructor> consumer2 = (x) -> System.out.println(x.getCourses());
        instructors.forEach(consumer1.andThen(consumer2)); //We can use existing consumer anywhere
        System.out.println("------------------------------");

        //Looping through all the instructors and printing out all the name if yearOfExperience is > 10
        instructors.forEach( x ->{
            if(x.getYearOfExperience() > 10) {
                consumer1.accept(x);
            }
        });
        System.out.println("------------------------------");
        //Looping through all the instructors and printing out all the name if yearOfExperience is > 5 and take online courses
        instructors.forEach( x ->{
            if(x.getYearOfExperience() > 5 && !x.isOnlineCourses()) {
                consumer1.andThen(consumer2).accept(x);
            }
        });

    }
}
