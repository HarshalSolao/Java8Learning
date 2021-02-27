package com.demo.java8.functionalprograming;

import java.util.List;

public interface InstructorFactory {

    public abstract Instructor getInstructor(String name, int yearOfExperience, String title, String gender, boolean onlineCourses, List<String> courses);

}
