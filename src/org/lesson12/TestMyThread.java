package org.lesson12;

public class TestMyThread {
    public static void main(String[] args) throws InterruptedException {
          for (int i = 0; i < 10; i++) {
            MyThread myThread = new MyThread();
            System.out.println(myThread.getName());
            System.out.println(myThread.getState());
            myThread.start();
            System.out.println(myThread.getName());
            System.out.println(myThread.getState());
            try {
                myThread.join();    //ждем пока другой поток завершится
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(myThread.getName());
            System.out.println(myThread.getState());
        }
    }

}
