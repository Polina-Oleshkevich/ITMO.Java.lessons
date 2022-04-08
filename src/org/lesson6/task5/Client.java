package org.lesson6.task5;

public class Client extends People {
    private String name;

    @Override
    public void setInfo() {
        System.out.println("Пользователь:");
        name = in.next();
    }

    public String getName() {
        return name;
    }
}
