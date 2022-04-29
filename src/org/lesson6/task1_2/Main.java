package org.lesson6.task1_2;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("biff", "biff", "R");
        BankOfficer bankOff = new BankOfficer("Jkj", "webp", "K");
        //Клиент
        System.out.println(client.getName());
        System.out.println(client.getSurname());
        System.out.println(client.getBankName());
        System.out.println(client.getInfo());
        //Банк
        System.out.println(bankOff.getName());
        System.out.println(bankOff.getSurname());
        System.out.println(bankOff.getBankName());
        System.out.println(bankOff.getInfo());
        infoPeople(client);
        infoPeople(bankOff);
    }

    public static void infoPeople(Human human) {
        System.out.println(human.getBankName());
        System.out.println(human.getInfo());
    }

}

