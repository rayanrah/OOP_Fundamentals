package se.lexicon;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println(ContactRepository.size()); // 0
        boolean isAdded1 = ContactRepository.add("Test, 1234, re@gmail.com");
        System.out.println(isAdded1); // true
        System.out.println(ContactRepository.size()); // 1
        System.out.println(ContactRepository.add("Test23, 12345, re@gmail.com")); //
        System.out.println(ContactRepository.size()); // 1




    }
}
