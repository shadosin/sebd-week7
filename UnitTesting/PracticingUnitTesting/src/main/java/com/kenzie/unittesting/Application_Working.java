package com.kenzie.unittesting;

import com.kenzie.unittesting.gradingfiles.IApplication;

public class Application_Working implements IApplication {

    public String addGreeting(String inputStr){
        return "Hello " + inputStr + "!";
    }

    public int addNumbers(int x, int y){
        return x + y;
    }

    // create countCharacter(Char c, String str) method
    public int countCharacter(char c, String str) {
        if(str.equals(null) || str.isEmpty())
            return 0;

        char lowerCaseVersionOfCharacter = String.valueOf(c).toLowerCase().charAt(0);
        char[] ch = str.toLowerCase().toCharArray();

        int totalChars = 0;
        //Loop through array and count character matches
        for (char i : ch) {
            //check for match with input character
            if (i == lowerCaseVersionOfCharacter) {
                totalChars++;
            }
        }
        return totalChars;
    }

}