package com.bellevue.moduleSix;

abstract public class Division {
    String divisionName;
    int accNumber;

    public Division(String divisionName, int accNumber) {
        this.accNumber = accNumber;
        this.divisionName = divisionName;
    }

    abstract public void display();
}
