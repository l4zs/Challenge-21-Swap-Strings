import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter String a"); // Announce user input for a

        // Example: a = "Hello";
        String a = myObj.nextLine(); // Read user input and save it to a

        System.out.println("Enter String b"); // Announce user input for b

        // Example: b = "World!";
        String b = myObj.nextLine();  // Read user input and save it to b

        System.out.println("Before swap:\na: " + a + "\nb: " + b + "\n"); // Show that values are assigned correctly
        a = a + b; // add b to a | Example: a = "HelloWorld!";
        b = a.substring(0, a.length() - b.length()); // set b to original a by setting it to a while removing b from a set before | Example: b = "HelloWorld!" - "World!"; -> b = "Hello";
        a = a.substring(b.length()); // set a to original b by removing new b (original a) from new a (right now original a + original b) | Example: a = "HelloWorld!" - "Hello"; -> a = "World!";
        System.out.println("After swap:\na: " + a + "\nb: " + b + "\n"); // Show that values are swapped correctly
    }
}
