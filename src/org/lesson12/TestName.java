package org.lesson12;

public class TestName {
    public static void main(String[] args) {
        Name thread1 = new Name();
        Name thread2 = new Name();
        thread1.start();
        thread2.start();
    }
}

