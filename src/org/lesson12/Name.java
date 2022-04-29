package org.lesson12;

public class Name extends Thread {
    private final Object lock = new Object();

    @Override
    public void run() {
        synchronized (lock) {
            lock.notifyAll();
            try {
                lock.wait();
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
}
