package app;

import java.util.Enumeration;
import java.util.Hashtable;
/**
 * HashDemp
 */
public class HashDemp {
    public static void main(String[] args) {
        //initialize Hashtable
        Hashtable<String, String> companies = new Hashtable<String, String>();

        //Add values
        companies.put("Google", "United States");
        companies.put("Nokia", "Finland");
        companies.put("Sony", "Japan");

        //Get value
        companies.get("Google");

        //Print out to user

        System.out.println("Hashtable contains Google as key: " + companies.containsKey("Google"));
        System.out.println("Hashtable contains Japan as value: " + companies.contains("Japan"));

        Enumeration<String> enumeration = companies.elements();

        while(enumeration.hasMoreElements()) {
            System.out.println("Hashtable Value: " + enumeration.nextElement());
        }

        System.out.println("Is company HashTable empty?: " + companies.isEmpty());

        System.out.println("Size of Hashtable in Java: " + companies.size());

        companies.clear();

    }
    
}