package org.lesson4;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] ar = new int[]{1, 2, 3, 4, 5};
        task1(ar);
        task5();
        task6();
    }

    public static void task1(int[] arrays) {
        boolean result = false;
        for (int i = 0; i < arrays.length - 1; i++) {
            if (arrays[i] < arrays[i + 1])
                result = true;
            else {
                result = false;
                System.out.println("Please, try again");
                break;
            }
        }
        if (result)
            System.out.println("OK");

    }

    public static void task5() {
        int[] array1 = new int[]{1, 2, 3, 1, 2, 4};
        for (int i = 0; i < array1.length; i++) {
            int count = 0;
            for (int j = 0; j < array1.length; j++) {
                if (i == j)
                    count++;
            }
            if (count == 1) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void task6() {
        int[] array = new int[]{2, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(array));
        boolean res = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 || array[i] == 3) {
                System.out.println("Массив содержит 1 или 3");
                return;
            }
            System.out.println("Массив не содержит 1, 3");
        }
    }
}
