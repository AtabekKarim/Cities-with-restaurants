package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);
    public static ArrayList<Restaurant> Restaurants = new ArrayList<>();
    public static ArrayList<City> Cities = new ArrayList<>();

    public static void main(String[] args) {

        int select = -1;

        while (select != 0) {
            System.out.println("1. Create city");
            System.out.println("2. Add restaurant");
            System.out.println("3. Income and outcome of all restaurants");
            System.out.println("4. Tax");
            System.out.println("5. Show all the cities");
            System.out.println("0. Exit");
            select = scan.nextInt();

            if (select == 1) {
                CreateCity();
            } else if (select == 2) {
                AddRestaurant();
            }
            else if (select == 3) {
                IncomeandOutcome();
            }
            else if (select == 4) {
                Tax();
            }
            else if (select == 5) {
                Allcities();
            }
        }
    }

    private static void CreateCity() {

            System.out.println("Enter name of the city: ");
            String name = scan.next();
            ArrayList<Restaurant> restaurants = new ArrayList<>();
            City newCity = new City (name, restaurants);
            Cities.add(newCity);

    }

    private static void AddRestaurant() {

        System.out.println("Enter name of the restaurant: ");
        String name = scan.next();
        while (!checkName(name)){
            System.out.println("Error, enter new name!");
            name = scan.next();
        }
        System.out.println("Which city this restaurant belongs to: ");
        for (int i=0;i<Cities.size();i++){
            System.out.println((i+1) + ") " + Cities.get(i).name);
        }
        int numberOfCity = scan.nextInt();
        String nameOfCity = Cities.get(numberOfCity-1).name;
        System.out.println("Enter income of this restaurant: ");
        double income = scan.nextInt();
        System.out.println("Enter outcome of this restaurant");
        double outcome = scan.nextInt();
        Restaurant newRestaurant = new Restaurant(name, nameOfCity, income, outcome);
        Restaurants.add(newRestaurant);

    }

    private static boolean checkName(String name) {
        for (Restaurant restaurant : Restaurants) {
            if (restaurant.name.equals(name)) {
                return false;
            }
        }
        return true;
    }

    private static void IncomeandOutcome() {
        double totalIncome = 0;
        double totalOutcome = 0;
        for (int i = 0;i<Restaurants.size(); i++) {
            totalIncome += Restaurants.get(i).income;
            totalOutcome += Restaurants.get(i).outcome;
        }
        System.out.println("Income of all restaurants: " + totalIncome);
        System.out.println("Outcome of all restaurants: " + totalOutcome);
    }

    private static void Tax() {
        System.out.println("Enter city: ");
        for (int i=0;i<Cities.size();i++){
            System.out.println((i+1) + ") " + Cities.get(i).name);
        }
        int cityId = scan.nextInt();
        double totalTax = 0;
        for (int i = 0;i<Restaurants.size(); i++){
            if (Restaurants.get(i).nameOfCity.equals(Cities.get(cityId - 1).name)){
                totalTax += (Restaurants.get(i).income - Restaurants.get(i).outcome) * 0.15;
            }
        }
        System.out.println("Total tax of " + Cities.get(cityId - 1).name + " city: " + totalTax );
    }

    private static void Allcities() {
        System.out.println("All cities: ");
        for (int i=0;i<Cities.size();i++){
            System.out.println(Cities.get(i).name);
        }

    }

}

