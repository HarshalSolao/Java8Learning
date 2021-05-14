package com.demo.programs;

public class LargestNoFromArray {

    public static void main(String[] args) {
        int arr[] = {12,14,2,77};

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
