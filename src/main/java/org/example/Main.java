package org.example;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Max", "Mustermann", 22, Owner.Gender.Male);
        Car myCar = new Car("Lamborghini", "LP 700-4", "yellow", 2001);

        owner.introduce();
        myCar.accelerate();
    }
}