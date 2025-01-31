package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Owner owner = new Owner("Max", "Mustermann", 17, Owner.Gender.Male);
            owner.introduce();
        } catch (IllegalArgumentException error) {
            System.out.println("Der Besitzer konnte nicht erstellt werden: " + error.getMessage());
        }

        Car myCar = new Car("Lamborghini", "LP 700-4", "yellow", 2001);
        myCar.accelerate();
    }
}