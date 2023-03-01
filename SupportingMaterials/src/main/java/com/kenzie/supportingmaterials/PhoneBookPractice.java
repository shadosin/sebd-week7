package com.kenzie.supportingmaterials;
import java.util.HashMap;

public class PhoneBookPractice {
    public static void main(String[] args) {

        // Declare and instantiate the HashMap
        HashMap<String, String> phoneBook = new HashMap<>();

        // Add original items to the phoneBook
        phoneBook.put("Burt", "+1-202-555-0118");
        phoneBook.put("Oscar", "+1-202-555-0220");
        phoneBook.put("Maria", "+1-202-555-0175");
        phoneBook.put("Ernie", "+1-202-555-0118");

        // Update Ernie's Number
        String ErniesOldNumber = phoneBook.replace("Ernie", "+1-202-555-1234");

        // Try to put in Big Bird's number
        phoneBook.putIfAbsent("Big Bird", "+1-202-555-0000");

        // Try to put in Oscar's number
        phoneBook.putIfAbsent("Oscar", "+1-202-555-0000");

        // Print out the phoneBook contacts
        for (String contactName : phoneBook.keySet()){
            System.out.println(contactName + " => " + phoneBook.get(contactName));
        }
    }

}
