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
        Plane.Wing plane1 = new Plane.Wing();
        plane1.setWeight(8000);
        plane1.display();
        Plane.Wing plane2 = new Plane.Wing();
        plane2.setWeight(5000);
        plane2.display();
    }
}

