package org.lesson9;

import java.util.*;

public class Collection1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, 2, 2);
        System.out.println(task1(list));
    }

    public static Set<Integer> task1(List<Integer> arList) {
        return new HashSet<>(arList);
    }
}




