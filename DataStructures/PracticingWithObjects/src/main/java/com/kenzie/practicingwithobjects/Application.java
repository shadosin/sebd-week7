package com.kenzie.practicingwithobjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    /*
        An EntryPass is unique if there is no pass with the same ID and access level.
        You will need to override equals() in EntryPass to check for equality of these items
        The equals() comparison is case-insensitive meaning VIP is equal to vip.
     */
    public static boolean addPassIfUnique(HashMap<String, EntryPass> entryPassByName, EntryPass entryPass) {
        // Fill in method
    // worked with Ben and Leanne to figure out multiple ways to get addPassIfUnique to work
        String key = entryPass.getName() + entryPass.getId();

        if (entryPassByName.containsValue(entryPass)) {

            return false;

        }else {
            entryPassByName.put(key, entryPass);
            return true;
        }
    }

    public static ArrayList<String> getVIPList(HashMap<String, EntryPass> entryPassesByName){
        // Fill in method
        ArrayList<String>vipList = new ArrayList<>();
        for(Map.Entry<String, EntryPass> entry: entryPassesByName.entrySet()){
            EntryPass entryPass = entry.getValue();
            if(entryPass.getAccessLevel().equalsIgnoreCase("vip")){
                vipList.add(entryPass.getName());
            }
        }
        return vipList;
    }

    public static void main(String[] args) {
        // Create a variable named entryPassesByName
        // This should be a HashMap with:
        // String as the Key type
        // EntryPass as the Value type
        // Also create an ArrayList of type String named blockList
        // These will be utilized in the print statements below


        // Write your code here
        HashMap<String, EntryPass> entryPassesByName = new HashMap<>();
        ArrayList<String> blockList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while(true){
            System.out.println("Enter Your Name");
            String name = scanner.next();

            System.out.println("Enter your ID");
            String id = scanner.next();

            System.out.println("Enter your Access Level");
            String accessLevel = scanner.next();

            EntryPass entryPass= new EntryPass(name, id, accessLevel);


            if(addPassIfUnique(entryPassesByName, entryPass)){
                System.out.println("Added to EntryList");
            }else{
                blockList.add(name);
                System.out.println("Blocked");
            }
            System.out.println("Countinue Y/N");
            String input = scanner.next();
            if(input.equalsIgnoreCase("N")){
                break;
            }
        }

        // Uncomment the block below to view results!

        System.out.println("Entry Pass List:");
        System.out.println(entryPassesByName.entrySet());
        System.out.println("Blocked list:");
        System.out.println(blockList);
        System.out.println("VIP List:");
        System.out.println(getVIPList(entryPassesByName));

    }
}