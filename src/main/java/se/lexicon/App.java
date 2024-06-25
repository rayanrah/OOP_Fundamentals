package se.lexicon;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        //Create object:
        // To create an object (instances of Car), we use the "new" keyword//

        Car newCar = new Car();
        newCar.registrationNumber = "123 ABC";
        newCar.year = 2020;
        newCar.brand = "Volvo";
        newCar.model = "V60";

        // We can call the "getCarInfo" method.
        // output: Car info -> Registration Number: 123 ABC , brand: Volvo, Model: V60, Year: 2020
        System.out.println(newCar.getCarInfo()); // output: Car info -> Registration Number: 123 ABC , brand: Volvo, Model: V60, Year: 2020







        /*Executive code for ContactRepository

        System.out.println(ContactRepository.size()); // 0
        boolean isAdded1 = ContactRepository.add("Test, 1234, re@gmail.com");
        System.out.println(isAdded1); // true
        System.out.println(ContactRepository.size()); // 1
        System.out.println(ContactRepository.add("Test23, 12345, re@gmail.com")); //
        System.out.println(ContactRepository.size()); // 1
        */

    }
}
