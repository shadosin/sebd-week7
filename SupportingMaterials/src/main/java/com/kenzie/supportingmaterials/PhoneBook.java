package com.kenzie.supportingmaterials;

import java.util.HashMap;

public class PhoneBook {


    // Properties
    private String description;
    private boolean sharable;
    private HashMap<String, String> phoneMap;
    // Constructors
    public PhoneBook(String description, boolean sharable){
        this.description = description;
        this.sharable = sharable;
        this.phoneMap = new HashMap<>();
    }
    // Methods
    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public boolean isSharable() {
        return
                sharable;
    }

    public void setSharable(boolean sharable) {

        this.sharable = sharable;
    }

    public HashMap<String, String> getPhoneMap() {

        return phoneMap;
    }

    public void setPhoneMap(HashMap<String, String> phoneMap) {

        this.phoneMap = phoneMap;
    }
    public void addPhoneNumber(String name, String phoneNumber){
        this.phoneMap.putIfAbsent(name, phoneNumber);
        System.out.println(this.phoneMap.get(name));
    }
}
