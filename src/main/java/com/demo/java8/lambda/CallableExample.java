package com.demo.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class CallableExample {
    public static int[] array = IntStream.rangeClosed(1,5000).toArray();
    public  static int total = IntStream.rangeClosed(1,5000).sum();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable callable = () -> {
            int sum = 0;
            for (int i=0;i<array.length/2;i++){
                sum = sum + i;
            }
            return sum;
        };

        Callable callable2 = () -> {
            int sum = 0;
            for (int i=array.length/2 + 1;i<array.length;i++){
                sum = sum + i;
            }
            return sum;
        };

        ExecutorService exe = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> taskList = Arrays.asList(callable,callable2);
        List<Future<Integer>> results = exe.invokeAll(taskList);
        int k = 0;
        int sum = 0;
        for(Future<Integer> result : results){
            sum = sum + result.get();
            System.out.println("Sum of : "+ (++k) + " is : "+ result.get());

        }
        System.out.println("Total callable sum : " + sum);
        System.out.println("Correct sum from Instream : " + total);
        exe.shutdown();
    }
}
