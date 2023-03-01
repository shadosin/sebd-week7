package com.kenzie.practicingwithobjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Application {

    /*
        A EntryPass is unique if there is no pass with the same ID and access level.
        You will need to override equals() in EntryPass to check for equality of these items
        The equals() comparison is case-insensitive meaning VIP is equal to vip.
     */
    public static boolean addPassIfUnique(HashMap<String, EntryPass> entryPassHashMap, EntryPass entryPass){
        //fill in method
        return false;
    }

    public static ArrayList<String> getVIPList(HashMap<String, EntryPass> hashMap){
        //fill in method
        return null;
    }

    public static void main(String[] args) {
        // Create a variable named entryPassesByName
        // This should be a HashMap with:
        // String as the Key type
        // EntryPass as the Value type
        // Also create an ArrayList of type String named blockList
        // These will be utilized in the print statements below


        // Write your code here

        //Uncomment the block below to view results!
        /*
        System.out.println("Entry Pass List:");
        System.out.println(entryPassesByName.entrySet());
        System.out.println("Blocked list:");
        System.out.println(blockList);
        System.out.println("VIP List:");
        System.out.println(getVIPList(entryPassesByName));
         */
    }
}