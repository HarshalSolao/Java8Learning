package com.demo.threading.threadings;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

//For Multithreaded environment to work with queue need safety for that we need to use
// lock n unlock with condition

public class MyBlockingQueue<E> {

    private Queue<E> queue;
    private int max = 16;
    private ReentrantLock lock = new ReentrantLock(true); //1.Create Lock
    private Condition notEmpty = lock.newCondition(); //4. Create 2 condition
    private Condition notFull = lock.newCondition();

    public MyBlockingQueue(int size) {
        this.queue = new LinkedList<>();
        this.max = size;
    }

    public void put(E e) {
        lock.lock();//2. Add lock
        try {
            while (queue.size() == max) {
                notFull.await(); //5. Add condition to wait until queue is not full
            }
            queue.add(e);
            notEmpty.signalAll(); //7. Notify to waiting thread to resume
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        } finally {
            lock.unlock();//3. remove lock
        }
    }

    public E take() {
        lock.lock();
        try {
            while (queue.size() == 0) {
                notEmpty.await(); // 6. Condition to wait if queue is empty
            }
            E item = queue.remove();
            notFull.signalAll(); //8. Notify to waiting thread to resume
            return item;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return null;
    }
}

