package org.lesson6.task5;

import java.util.Scanner;

public class People {


    private int age;
    public Scanner in = new Scanner(System.in);

    public void setInfo() {
        System.out.println("Age:");
        age = in.nextInt();
    }
    public int getAge() {
        return age;
    }

}
