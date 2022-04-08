package org.lesson6.task3;

public class Truck extends Car {
    private int numberOfWheels;
    private int maxWeight;

    public Truck(int w, String m, char c, float s, int numberOfWheels, int maxWeight) {
        super(w, m, c, s);
        this.numberOfWheels = numberOfWheels;
        this.maxWeight = maxWeight;
    }


    public void newWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        System.out.println("Количество колёс: " + numberOfWheels);
    }

}
