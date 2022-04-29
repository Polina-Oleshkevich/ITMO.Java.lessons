package org.lesson6.task1_2;

public class BankOfficer extends Human {


    private String bankName;

    public BankOfficer(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }
    @Override
    public String getBankName() {
        return bankName;
    }

    @Override
    public String getInfo() {
        return "name";
    }
}