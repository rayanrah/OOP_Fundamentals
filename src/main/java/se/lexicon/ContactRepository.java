package se.lexicon;

import java.util.Arrays;

public class ContactRepository {

    // 2. Add a Method: Inside the contact repository we assume that we have limitation.
    // 'only' 100 contacts available to store.
    private static final int MAX_SIZE = 100;
    // 1. First declare the storage or container to store the information.
    private static String[] contacts = new String[0];

    //3. Create a "Method" that manipulate the contents of the contacts.
    // First part is about 'Add a Contact'.
    public static boolean add(String contact) {

        // i. Add exception argument to terminate the APP of the logical Error detected.
        // ii. Validation or check the input parameters to be correct. if the length of contact os the less than the MAX size.
        // iii. check if the Number or contact exist in the Array contacts or not.
        // iv. Add a logics. We need to add one space for storing data by users.
        // ivv. We Run the code inside the App Class.

        // i.When the 'Logical Error' happen: We generate the Exception and terminate application.
        if (contact == null || contact.isEmpty()) {
            //throw new IllegalArgumentException("Contact Data in null.");
            return false;
        }
        //ii.
        if (contacts.length > MAX_SIZE) {
            //throw new IllegalArgumentException("Contact length is  >" + MAX_SIZE);
            return false;

        }

        if (isDuplicatedMobileNumber(contact)) {
            //throw new IllegalArgumentException("Data Duplicated");
            return false;
        }

        // iv. After checking all the conditions now we can Add a logics.
        // We need to add one space for storing data by users.
        String[] newArray = Arrays.copyOf(contacts, contacts.length + 1);
        newArray[newArray.length - 1] = contact;
        contacts = newArray;

        return true;
    }

    //iii.Method to check if Number or contact exist in the Array contacts or not.
    // We need to Split the Array to reach the Mobile Number. "Name,Mobile,Email".
    // We iterate on Array  ( Enhance Loop) to check the existence number and compare it.
    public static boolean isDuplicatedMobileNumber(String contact) {

        String paramMobileNumber = contact.split(",")[1];
        for (String contactElement : contacts) { // Access the elements of the Contacts Array.
            // Split the contents of the contacts.
            String elementMobileContacts = contactElement.split(",")[1];

            if (elementMobileContacts.equals(paramMobileNumber)) {
                return true;
            }
        }
        return false;


    }

    public static int size() {
        return contacts.length;
    }

} // Class
