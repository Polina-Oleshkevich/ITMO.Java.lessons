package org.lesson9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class User {


    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;


    public static void main(String[] args) {
        User jack = new User("Jack");
        User ola = new User("Ola");

        Map<User, Integer> userIntegerMap = new HashMap<>();
        userIntegerMap.put(jack, 5);
        userIntegerMap.put(ola, 7);


        System.out.println("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String printName = scanner.nextLine();
        System.out.println(scanner);
        Set<User> keys = userIntegerMap.keySet();
        System.out.println(printName);

        printScore(userIntegerMap, printName);
        printUser(userIntegerMap);
    }

    private static void printScore(Map<User, Integer> userIntegerMap, String printName) {
        Integer score = null;
        for (Map.Entry<User, Integer> pair : userIntegerMap.entrySet()) {
            if (pair.getKey().getName().equals(printName)) {
                score = pair.getValue();
                break;
            }
        }
        System.out.println((score == null ? "Ошибка " : +score));
    }

    public static void printUser(Map<User, Integer> userIntegerMap) {

        for (Map.Entry<User, Integer> pair : userIntegerMap.entrySet()) {
            System.out.print(pair.getKey().getName());
        }

        System.out.println();
    }

}

