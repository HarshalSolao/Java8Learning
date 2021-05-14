package com.demo.programs;

public class PositiveOrNegativeNo {

    public static void main(String[] args) {
        double noToCheck = 34.77;

        String result = noToCheck > 0.0? "Positive":"Negative";

        System.out.println(String.format("The no %s is %s",String.valueOf(noToCheck),result));


    }
}
