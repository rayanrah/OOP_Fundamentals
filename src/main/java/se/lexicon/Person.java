package se.lexicon;

public class Person {

    // Declaring fields.
    private String personalNumber;
    private String name;
    private String email;
    private String phoneNumber;

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
    }

    // Declare constructor.02
    public Person(String personalNumber, String phoneNumber, String name) {
        this.personalNumber = personalNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
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
        ValidateStringParam(phoneNumber,"Phone Number");
        this.phoneNumber = phoneNumber;
    }

    /* info: As we can see there is a same conditions for all our setters and then we
        can make a Method for that. */
    public void ValidateStringParam(String inputParam, String paramName) {
        if (inputParam == null || inputParam.trim().isEmpty()) {
            throw new IllegalArgumentException (paramName + "can not be null or empty.");
        }
    }

    //

}
