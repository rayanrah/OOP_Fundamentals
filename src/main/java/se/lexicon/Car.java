package se.lexicon;

public class Car {

    // The class 'Car' is a blueprint, and it has both 1--> Data (fields) and 2 --> methods (behavior).

    // Fields (Variables): we need to specify the fields for Car template.
    // these variables can store the data of the object.
    String registrationNumber;
    String brand;
    String model;
    int year;

    /*Create object in APP class:
    To create an object (instances of Car), we use the "new" keyword
    followed by a call to the class constructor.

    Car newCar = new Car(); */


    // Methods (Behaviour) -
    // The purpose of Method is to collect the information of instance data and return it to the text sentence.
    // when we call 'getCarInfo', it should provide the summary information about the car.
    public String getCarInfo () {
        String result = "Car info -> Registration Number: " + registrationNumber + " , brand: " + brand + ", Model: " + model + ", Year: " + year;
        return result;
    }



}
