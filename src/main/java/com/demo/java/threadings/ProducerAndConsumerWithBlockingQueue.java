package com.demo.java.threadings;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerAndConsumerWithBlockingQueue {
    public static void main(String[] args) throws InterruptedException {
        //Thread safe queue: https://www.youtube.com/watch?v=UOr9kMCCa5g
        BlockingQueue<Item> queue = new ArrayBlockingQueue<>(10);

        //Producer
        final Runnable producer = () -> {
            while (true) {
                try {
                    Item i = new Item(Math.random() + 2.4);
                    queue.put(i);
                    System.out.println(Thread.currentThread().getName() +" :" + i);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(producer,"Producer 1").start();
        new Thread(producer,"Producer 2").start();

        //Consumer
        final Runnable consumer = () -> {
            while (true) {
                try {
                    Item i = queue.take();
                    System.out.println(Thread.currentThread().getName() +" :" + i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(consumer,"Consumer 1").start();
        new Thread(consumer, "Consumer 2").start();

        Thread.sleep(1000);

    }
}
