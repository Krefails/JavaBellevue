package com.bellevue.moduleSix;

public class DomesticDivision extends Division {
    private final String state;

    public DomesticDivision(String name, int accountNumber, String state) {
        super(name, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.printf("Now printing Domestic Division,\n\tDivision Name: %s, Account Number: %d, State: %s\n", DomesticDivision.this.divisionName, DomesticDivision.this.accNumber, DomesticDivision.this.state);
    }
}
