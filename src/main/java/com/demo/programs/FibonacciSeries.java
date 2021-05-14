package com.demo.programs;

public class FibonacciSeries {

    public static void main(String[] args) {
        //OP - 0 1 1 2 3 5 8 13 21 34.....
        int noOfElements = 50;

        int ele1 = 0;
        int ele2 = 1;

        for (int i = 0; i < noOfElements; i++) {
            System.out.print(ele1 + " ");
            int sum = ele1 + ele2;
            ele1 = ele2;
            ele2 = sum;
        }
    }
}
