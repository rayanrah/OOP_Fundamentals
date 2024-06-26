package se.lexicon;

import java.time.LocalDate;
import java.util.UUID;

public class Car {

    // The class 'Car' is a blueprint, and it has both 1--> Data (fields) and 2 --> methods (behavior).

    // Fields (Variables): we need to specify the fields for Car template.
    // these variables can store the data of the object.
    String registrationNumber;
    String brand;
    String model;
    int year;

    /* Create object in APP class:
    To create an object (instances of Car), we use the "new" keyword
    followed by a call to the class constructor.
    Car newCar = new Car(); */

    /* Constructor-01:
    - "Special types of method" that use to create (initialize) a new objects.
    - They called automatically when an object of a class is created.
    - Ensure all created objects are valid state.
    - They set up 'initial values' for object fields.
    - There is no return type for this method.
    - The Name of the Constructor should be always the same name as Class.
    - We set the value of the 'constructor' fields to 'Car class fields'. we write them inside the {}.
      we use the keyword "this." to specify that is field of the Car class and not our Constructor.
    - There will be 'no default constructor' with empty fields after we create this one here.
    - For now, you have to add the value to fields when you create a new object in App class --> Car newCar = new Car();
    */
    public Car (String regNumber, String brand, String model, int year) {
        registrationNumber = regNumber;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    /* Constructor-02:
    Year output --> LocalDate.now().getYear();
    Automatically generate a Random Number --> UUID.randomUUID().toString().substring(0,8);
    */

    /* ifo: Chaining Constructor:
    Refers to the practice of calling one constructor from another constructor within the same class
    or from the constructor of a parent class.
    Constructor chaining helps reduce code duplication and keeps initialization logic centralized.
    ex:
        public Car (String brand, String model){
            this (regNumber, brand, model, LocalDate.now().getYear() )
        }
    */

    public Car (String brand, String model){
        this.registrationNumber = UUID.randomUUID().toString().substring(0,8); // Generate random number.
        this.brand = brand;
        this.model = model;
        this.year = LocalDate.now().getYear();
    }

    // Methods (Behaviour) -
    // The purpose of Method is to collect the information of instance data and return it to the text sentence.
    // when we call 'getCarInfo', it should provide the summary information about the car.
    public String getCarInfo () {
        String result = "Car info -> Registration Number: " + registrationNumber + " , brand: " + brand + ", Model: " + model + ", Year: " + year;
        return result;

    }



}
