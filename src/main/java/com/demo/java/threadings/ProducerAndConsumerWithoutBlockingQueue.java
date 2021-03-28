package com.demo.java.threadings;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//Que. Create Producer Consumer without blocking queues
//Ans. 1. Using Locks and condition & Wait n notify method
public class ProducerAndConsumerWithoutBlockingQueue {
    public static void main(String[] args) throws InterruptedException {

        MyBlockingQueue<Item> queue = new MyBlockingQueue<>(10);

        //Producer
        final Runnable producer = () -> {
            while (true) {
                try {
                    Item i = new Item(Math.random() + 2.4);
                    queue.put(i);
                    System.out.println(Thread.currentThread().getName() + " :" + i);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(producer, "Producer 1").start();
        new Thread(producer, "Producer 2").start();

        //Consumer
        final Runnable consumer = () -> {
            while (true) {
                try {
                    Item i = queue.take();
                    System.out.println(Thread.currentThread().getName() + " :" + i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(consumer, "Consumer 1").start();
        new Thread(consumer, "Consumer 2").start();

        Thread.sleep(1000);

    }
}
