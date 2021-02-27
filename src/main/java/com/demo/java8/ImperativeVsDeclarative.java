package com.demo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

    public static void main(String[] args) {

        //Imperative    (HOW - We instructed how it will work)
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //Imperative style calculating sum
        int sum = 0;
        for (int i = 0; i <=5; i++) {
            sum+=i;
        }
        System.out.println(sum);

        //Imperative style find minimum
        List<Integer> listNumbers = Arrays.asList(1,2,3,4,5,6,7,8);
        int min = listNumbers.get(0);
        for (int i = 0; i < listNumbers.size(); i++) {
            if (listNumbers.get(i) < min){
                min = listNumbers.get(i);
            }
        }
        System.out.println("MIN : " + min);


        //Declarative   (What-Without instructing you can say to do that)
        IntStream numbers = IntStream.of(1,2,3,4,5);
        numbers.forEach(System.out::println);

        IntStream numbers1 = IntStream.rangeClosed(1,5);
        numbers1.forEach(System.out::println);

        //Declarative style calculating sum

        int total = IntStream.of(1,2,3,4,5).sum();
        System.out.println(total);

        int total1 = IntStream.rangeClosed(1,5).sum();
        System.out.println(total1);

        //Declarative style find minimum
        List<Integer> listNumbers1 = Arrays.asList(21,31,4,15,6,17,8);
        listNumbers1.stream().min(Integer::compareTo);
        System.out.println(listNumbers1.stream().min(Integer::compareTo));

    }
}
