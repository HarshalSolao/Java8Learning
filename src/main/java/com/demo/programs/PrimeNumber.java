package com.demo.programs;

public class PrimeNumber {
    public static void main(String[] args) {
        int no = 246;
        boolean flag = false;
        for (int i = 2; i < no/2; i++) {
            if (no % 2 == 0){
                flag = true;
                break;
            }
        }
        if(flag)
            System.out.println("Prime No");
        else
            System.out.println("Not a prime");
    }
}
