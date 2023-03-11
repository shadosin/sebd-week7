package com.kenzie.supportingmaterials;

import java.util.HashMap;
import java.util.Map;

public class MapsPractice {

    public static void practiceOne() {
        // Create beverage map
    HashMap<String, String> beverageMap = new HashMap<>();
    beverageMap.put("water", "standard");
    beverageMap.put("juice", "standard");
    beverageMap.put("coffee", "standard");
    beverageMap.put("wine", "premium");
    beverageMap.put("mocha", "premium");
        System.out.println(beverageMap.entrySet());
        // Create animal map
        HashMap<String, Integer> animalMap = new HashMap<>();
        animalMap.put("Dog", 4);
        animalMap.put("spider", 8);
        animalMap.put("human", 2);
        animalMap.put("centipede", 100);
        System.out.println(animalMap.entrySet());

    }

    public static void practiceTwo() {

        HashMap<String, Double> priceMap = new HashMap<>();

        priceMap.put("sweater",20.00);
        priceMap.put("bike",100.00);
        priceMap.put("box of chocolates",12.50);
        priceMap.put("flowers",35.00);
        priceMap.put("ring",199.99);
        priceMap.put("candle",8.25);

        // Write loop here
        for(Map.Entry<String, Double> entry : priceMap.entrySet()){
            if(entry.getValue() <= 20){
                System.out.println(entry.getKey() + ", " + entry.getValue()+"\n");
            }
        }
    }
    public static void main(String[] args){
        practiceOne();
        practiceTwo();
    }
}
