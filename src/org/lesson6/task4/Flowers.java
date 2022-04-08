package org.lesson6.task4;

import java.util.Scanner;

public class Flowers {

    private int price;


    public void setPrice() {
        System.out.println("Введите цену:");
        Scanner in = new Scanner(System.in);
        price = in.nextInt();
    }

    public int getPrice() {
        return price;
    }
}
