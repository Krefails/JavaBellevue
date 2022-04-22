package com.bellevue.moduleSix;

public class InternationalDivision extends Division {
    private final String country;
    private final String language;

    public InternationalDivision(String name, int accountNumber, String country, String language) {
        super(name, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.printf("Now printing International Division,\n\tDivision Name: %s, Account Number: %d\n\tCountry: %s, Language: %s\n", InternationalDivision.this.divisionName, InternationalDivision.this.accNumber, InternationalDivision.this.country, InternationalDivision.this.language);
    }
}
