package se.lexicon;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        /* Create a new object:
        - To create an object (instances of Car), we use the "new" keyword.
        --> Car newCar = new Car(); */

        /* Create an object by default constructor:
        - This method works only when you are using a default constructor with empty fields.
        - The following code gives you an Error after you create a Constructor at the Car class.
        ------
        Car newCar = new Car();
        newCar.registrationNumber = "123 ABC";
        newCar.year = 2020;
        newCar.brand = "Volvo";
        newCar.model = "V60"; */


        /* Create a new object based on constructor:
        - After you create a Constructor at Car class,
         you have to add the value to fields when you create a new object.
        - You need to create a 'new constructor' if you want to initialize the new object with fewer fields.
          like: "regNumber, brand, model".
          */

         Car Car1 = new Car("ABC 13456", "Volvo", "V60", 2016);
         Car Car2 = new Car("Volvo", "V60");


        System.out.println(Car1.getCarInfo());
        System.out.println(Car2.getCarInfo());




        /*Executive code for "ContactRepository" Class:
        -----
        System.out.println(ContactRepository.size()); // 0
        boolean isAdded1 = ContactRepository.add("Test, 1234, re@gmail.com");
        System.out.println(isAdded1); // true
        System.out.println(ContactRepository.size()); // 1
        System.out.println(ContactRepository.add("Test23, 12345, re@gmail.com")); //
        System.out.println(ContactRepository.size()); // 1
        */

    }

}
