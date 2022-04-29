package org.lesson12;

public class Name extends Thread {
   // private final Object lock = new Object();

    @Override
    public synchronized void run() {
        notifyAll();
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int i = 0;
        while (i < 100) {
            i++;
            System.out.println(Thread.currentThread().getName());
        }
    }
}

