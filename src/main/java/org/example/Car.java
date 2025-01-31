package org.example;

class Car {
    String brand;
    String model;
    String color;
    int yearOfManufacture;
    double speed = 0;

    public Car (String brand, String model, String color, int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;

        String createdCarMessage = String.format("Ein Auto wurde mit folgenden Daten angelegt: %s %s %d", brand, model, yearOfManufacture);
        System.out.println(createdCarMessage);
    }

    public void accelerate() {
        this.speed = 20;

        String speedChangedMessage = String.format("Das Auto %s %s wurde auf 20 km/h beschleunigt", brand, model);
        System.out.println(speedChangedMessage);
    }
}
