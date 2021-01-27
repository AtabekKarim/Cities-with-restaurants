package com.company;

public class Restaurant {

    String name;
    String nameOfCity;
    double income;
    double outcome;

    public Restaurant(String name, String nameOfCity, double income, double outcome) {
        this.name = name;
        this.nameOfCity = nameOfCity;
        this.income = income;
        this.outcome = outcome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfCity() {
        return nameOfCity;
    }

    public void setNameOfCity(String nameOfCity) {
        this.nameOfCity = nameOfCity;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getOutcome() {
        return outcome;
    }

    public void setOutcome(double outcome) {
        this.outcome = outcome;
    }
}
