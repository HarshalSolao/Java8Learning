package com.demo.programs;

public class SecondLargestNo {
    public static void main(String[] args) {
        int arr[] = {12,14,2,77,44,24};

        int max1;
        int max2;
        if(arr[0] > arr[1]){
            max1 = arr[0];
            max2 = arr[1];
        } else{
            max2 = arr[0];
            max1 = arr[1];
        }

        for (int i = 2; i < arr.length ; i++) {
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            } else if(arr[i] < max1 && arr[i] > max2){
                max2 = arr[i];
            }
        }

        System.out.println(max2);

    }
}
