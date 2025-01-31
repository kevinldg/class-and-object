package org.example;

public class Owner {
    String firstName;
    String lastName;
    int age;
    Gender gender;

    enum Gender {
        Male, Female, Diverse
    };

    public Owner(String firstName, String lastName, int age, Gender gender) {

        if (age < 18) {
            throw new IllegalArgumentException("Das Mindestalter für einen Besitzer beträgt 18 Jahre. Angegebenes Alter: " + age);
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;

        String createdOwnerMessage = String.format("Ein Besitzer wurde mit folgenden Daten angelegt: %s %s %d %s", firstName, lastName, age, gender);
        System.out.println(createdOwnerMessage);
    }

    public void introduce() {
        String introduction = String.format("Hallo, ich bin %s %s und bin %d Jahre alt!", firstName, lastName, age);
        System.out.println(introduction);
    }
}
