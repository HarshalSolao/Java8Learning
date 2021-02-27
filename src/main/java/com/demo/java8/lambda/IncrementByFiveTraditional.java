package com.demo.java8.lambda;

public class IncrementByFiveTraditional implements IncrementByFive, HelloWorldInterface {
    @Override
    public int incrementByFive(int a) {
        return a+5;
    }

    @Override
    public void show() {
        HelloWorldInterface.super.show();
    }

    public static void main(String[] args) {
        IncrementByFiveTraditional obj = new IncrementByFiveTraditional();
        System.out.println(obj.incrementByFive(24));

        IncrementByFive.show1();
        obj.show();

    }
}
