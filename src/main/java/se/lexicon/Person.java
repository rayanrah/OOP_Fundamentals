package se.lexicon;

import java.util.Arrays;

public class Person {

    // Declaring fields.
    private String personalNumber;
    private String name;
    private String email;
    private String phoneNumber;
    private Car[] carsOwned; // Person can have multiple cars.

    /* info: Chaining Constructor: refers to the practice of calling one constructor
    from another within the same class or from a constructor in a parent class.
    This is achieved using the "this keyword" (for chaining within the same class)
    or the super keyword (for chaining to a parent class constructor).
    Constructor chaining helps reduce code duplication.
     Example Here: this (personalNumber, name, personalNumber); */

    // Declare constructor.01. (It should be always come in the First Line.)
    public Person(String personalNumber, String name, String email, String phoneNumber) {
        this(personalNumber, name, personalNumber);
        this.phoneNumber = phoneNumber;
        this.carsOwned = new Car[0];
    }

    // Declare constructor.02
    public Person(String personalNumber, String phoneNumber, String name) {
        this.personalNumber = personalNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.carsOwned = new Car[0];

    }

    // Getter for Name:
    public String getName() {
        return name;
    }

    // Setter for Name:
    public void setName(String name) {
        ValidateStringParam(name, "Name");
        this.name = name;
    }

    // setter for Email:
    public void setEmail(String email) {
        ValidateStringParam(email, "Email");
        this.email = email;
    }

    /* info: replace this with the ValidateStringParam Method.
       if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
       throw new IllegalArgumentException("Phone Number can not be null or empty."); } */

    // setter for phone number:
    public void setPhoneNumber(String phoneNumber) {
        ValidateStringParam(phoneNumber, "Phone Number");
        this.phoneNumber = phoneNumber;
    }

    /* info: As we can see there is a same conditions for all our setters and then we
        can make a Method for that. */
    public void ValidateStringParam(String inputParam, String paramName) {
        if (inputParam == null || inputParam.trim().isEmpty()) {
            throw new IllegalArgumentException(paramName + "can not be null or empty.");
        }
    }

    // ---------Method responsible to Add a car to existing Array of car. ---------------//

    public void addOwnedCar(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("car cannot be null");
        }
        carsOwned = Arrays.copyOf(carsOwned, carsOwned.length + 1);
        carsOwned[carsOwned.length - 1] = car;
        car.setOwner(this);
    }
    // ---------Finish the code for Adding a car to existing Array -----------------//


    // ---------Method responsible to remove a car from existing Array of car. ---------------//
    public void removeOwnedCar(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("car cannot be null");
        }
        // find the index of the car in the array.
        int index = -1;
        for (int i = 0; i < carsOwned.length; i++) {
            if (carsOwned[i].equals(car)) {
                index = i;
                break;
            }
        }
        // If the car is found, remove it
        if (index != -1) {
            // Create a new array excluding the car to be removed
            Car[] updatedCarsOwned = new Car[carsOwned.length - 1];

            // Copy elements before the removed car
            for (int i = 0; i < index; i++) {
                updatedCarsOwned[i] = carsOwned[i];
            }

            // Copy elements after the removed car
            for (int i = index + 1; i < carsOwned.length; i++) {
                updatedCarsOwned[i - 1] = carsOwned[i];
            }

            // Update the carsOwned array
            carsOwned = updatedCarsOwned;

            car.setOwner(null);
        } else {
            throw new IllegalArgumentException("Car not found in the list of owned cars.");
        }
        // ---------Finish the code for remove a car from existing Array -----------------//
    }

    public String getPersonInfo() {
        return "Name: " + name + " , Email" + email; // concat more fields as needed
    }

}
