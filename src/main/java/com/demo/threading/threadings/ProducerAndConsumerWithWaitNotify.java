package com.demo.threading.threadings;

//Que. Create Producer Consumer without blocking queues
//Ans. 1. Using Locks and condition & Wait n notify method
public class ProducerAndConsumerWithWaitNotify {
    public static void main(String[] args) throws InterruptedException {

        MyBlockingQueue2<Item> queue = new MyBlockingQueue2<>(10);

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
