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
        practicingMethods(phoneBook);

    }
    public static void practicingMethods(HashMap<String, String> phoneBook){
        System.out.println(phoneBook.size());
        if(phoneBook.containsKey("Maria")){
            System.out.println("Yes!");
        }
        phoneBook.remove("Oscar");
        phoneBook.replace("Burt", "+1-202-867-5309");
        System.out.println(phoneBook.getOrDefault("Ryan Reynolds", "Sorry"));
        System.out.println(phoneBook.size());
        System.out.println(phoneBook.entrySet());
    }
    public static String lookUpAreaCode(String phoneNumber){
        String areaCode = phoneNumber.replaceAll("^\\d.]", "").substring(1,4);

        HashMap<String, String> areaCodeMap = new HashMap<>();

        areaCodeMap.put("208", "Idaho");
        areaCodeMap.put("530", "California");
        areaCodeMap.put("971", "Oregon");
        System.out.println(areaCodeMap.entrySet());

        String value = areaCodeMap.getOrDefault("907", "Not found");
        System.out.println(value);
        return value;
    }
}
