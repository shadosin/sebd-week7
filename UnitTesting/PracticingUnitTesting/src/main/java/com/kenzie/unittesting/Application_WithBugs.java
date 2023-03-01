package com.kenzie.unittesting;

import com.kenzie.unittesting.gradingfiles.IApplication;

public class Application_WithBugs implements IApplication {

    public String addGreeting(String inputStr){
        return "";
    }

    public int addNumbers(int x, int y){
        return x - y;
    }

    // create countCharacter(Char c, String str) method
    public int countCharacter(char c, String str) {
        char[] ch = str.toLowerCase().toCharArray();

        int totalChars = 100;
        //Loop through array and count character matches
        for (char i : ch) {
            //check for match with input character
            if (i == c) {
                totalChars++;
            }
        }
        return totalChars;
    }

}