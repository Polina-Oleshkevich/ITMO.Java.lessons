package org.lesson6.task1_2;

public class Client extends Human {
    private String bankName;




    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }
    @Override
    public String getBankName() {
        return bankName;
    }

    @Override
    public String getInfo() {
        return null;
    }
}
