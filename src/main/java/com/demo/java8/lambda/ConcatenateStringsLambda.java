package com.demo.java8.lambda;

public class ConcatenateStringsLambda {
    public static void main(String[] args) {
        ConcatenateInterface cd = (a, b) -> a.concat(b);

        System.out.println(cd.sconcate("Hello " , "Harshal"));

        String h = "Harshal";
        h.concat(" Solao");

        System.out.println(h);
    }
}
