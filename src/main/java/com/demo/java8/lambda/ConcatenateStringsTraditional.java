package com.demo.java8.lambda;

public class ConcatenateStringsTraditional  implements ConcatenateInterface{
    @Override
    public String sconcate(String a, String b) {
        return a.concat(b);
    }

    public static void main(String[] args) {
        ConcatenateStringsTraditional cd = new ConcatenateStringsTraditional();
        System.out.println(cd.sconcate("Hello ", "Harshal"));
    }
}
