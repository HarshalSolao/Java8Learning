package com.demo.java.threadings;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

//For Multithreaded environment to work with queue need safety for that we need to use
// wait and notify

public class MyBlockingQueue2<E> {

    private Queue<E> queue;
    private int max = 16;

    public MyBlockingQueue2(int size) {
        this.queue = new LinkedList<>();
        this.max = size;
    }

    public void put(E e) {
        synchronized(queue) {
            try {
                while (queue.size() == max) {
                    queue.wait();
                }
                queue.add(e);
                queue.notifyAll();
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }

    public E take() {
        synchronized (queue) {
            try {
                while (queue.size() == 0) {
                    queue.wait();
                }
                E item = queue.remove();
                queue.notifyAll();
                return item;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}

