package com.demo.java8.functionalprograming;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        //Reverse of consumer interface
        Supplier<Integer> supplier = () -> (int) (Math.random() * 1000);

        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}
