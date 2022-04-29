package org.lesson12;

public class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            i++;
            System.out.println(i);
        }
    }
}
