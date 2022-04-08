package org.lesson6.task1_2;

public abstract class Human implements People{
    private String name;
    private String surname;


    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public abstract String getInfo();
}
