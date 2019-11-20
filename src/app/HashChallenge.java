package app;

import java.util.Hashtable;
import java.util.Scanner;

/**
 * HashChallenge
 */
public class HashChallenge {

    public static void main(String[] args) {
        //Setup Input
        Scanner scan = new Scanner(System.in);
        
        //Make Hashtable
        Hashtable<String, Integer> midterms = new Hashtable<String, Integer>();


        //Take user inputs
        String name = "";
        do {
            System.out.println("Enter a name and test score ('exit' to exit)");
            System.out.print("Name: ");
            name = scan.next();
            if (!name.equals("exit")) {
                System.out.print("Grade: ");
                Integer score = scan.nextInt();
                midterms.put(name, score);
                System.out.println();
            }
        }   while(!name.equals("exit"));

        //Ask user for a key to look for a value
        System.out.print("\nEnter a key to search for: ");
        String key = scan.next();

        //Print out if the kew exists
        if (midterms.containsKey(key)) {
            System.out.println("\nThe value is: " + midterms.get(key));
        }   else {
            System.out.println("No key found!");
        }

        scan.close();
        midterms.clear();
    }
}