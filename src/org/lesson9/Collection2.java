package org.lesson9;

import java.util.List;
import java.util.Random;

public class Collection2 {

    public static void getArrayList(List<Double>list) {
            for (int i = 1; i <= 1000000; i++) {
                list.add((double) i);
            }
            int size = list.size();
            System.out.println("Добавлено " + size);
        }


        public static void time1(List<Double> doubleList) {
        long l1 = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i <= 100000; i++) {
            double a = doubleList.get(random.nextInt(doubleList.size()));
            System.out.println(a);
        }
        long l2 = System.nanoTime();
        long l = l2-l1;
        System.out.println(l);
    }





}

