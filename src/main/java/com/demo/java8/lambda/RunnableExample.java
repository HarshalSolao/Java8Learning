package com.demo.java8.lambda;

public class RunnableExample {

    public static void main(String[] args) {
        //Runnable in traditional way
        Runnable run = new Runnable() {
            @Override
            public void run() {
                int sum=0;
                for (int i =0;i<10;i++)
                    sum+=i;
                System.out.println("Traditional : " + sum);
            }
        };

        new Thread(run).start();

        //Runnable in Lambda way
        Runnable run1 = () -> {
            int sum=0;
            for (int i =0;i<10;i++)
                sum+=i;
            System.out.println("Lambda Way : " + sum);
        };

        new Thread(run1).start();

        //Thread with lambda way
        new Thread( () -> {
            int sum=0;
            for (int i =0;i<10;i++)
                sum+=i;
            System.out.println("Thread Lambda Way : " + sum);
        }).start();

    }
}
