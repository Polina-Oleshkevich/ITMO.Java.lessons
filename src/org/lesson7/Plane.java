package org.lesson7;

public class Plane {

    public static class Wing {
        private int weight;

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void display() {
            System.out.println("Вес крыла: " + weight);
        }


    }
    public static void main(String[] args) {
        Plane.Wing wing1 = new Plane.Wing();
        wing1.setWeight(8000);
        wing1.display();
        Plane.Wing wing2 = new Plane.Wing();
        wing2.setWeight(5000);
        wing2.display();
    }
}

