package com.kenzie.unittesting;

import com.kenzie.unittesting.gradingfiles.IApplication;
import org.junit.Test;
import junit.framework.TestCase;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ApplicationTest extends TestCase {

    // Students, write your answers for tests in this file.
    // DO NOT RUN THIS FILE
    // To verify that your tests are correct, run the ApplicationTestVerifier.java file

    //Write a test method to check that the addGreeting method contains "Hello" as the first five characters in the string
    //This first one has been done for you
    @Order(1)
    @Test
    public void testAddGreetingContainsHello() {
        //ARRANGE
        String nameForTesting = "Zack";
        String expectedResult = "Hello";

        //ACT
        String actualString = Application.addGreeting(nameForTesting);
        String stringToTest = actualString.substring(0,5);

        //ASSERT
        assertEquals(stringToTest, expectedResult);
    }

    //Write a test method to check that the addGreeting method contains the correct greeting
    @Order(2)
    @Test
    public void testAddGreeting(){
        //ARRANGE

        //ACT

        //ASSERT

    }

    //Write a test method to check that the addNumbers method works correctly
    @Order(3)
    @Test
    public void testAddNumbers(){
        //ARRANGE

        //ACT

        //ASSERT

    }

    //Write a test method to check that the countCharacter method
    //Can be called with alphabetic characters (letters)
    @Order(4)
    @Test
    public void testCountCharacterMatchLetters() {
        //ARRANGE

        //ACT

        //ASSERT

    }

    //Test that countCharacter can be used to match punctuation characters
    @Order(5)
    @Test
    public void testCountCharacterMatchPunctuation() {
        //ARRANGE

        //ACT

        //ASSERT

    }

    //Edge case: Test that countCharacter can handle an empty string
    @Order(6)
    @Test
    public void testCountCharactersEmptyString() {
        //ARRANGE

        //ACT

        //ASSERT

    }

    //Edge case: Test that countCharacter can handle case-insensitive matching
    @Order(7)
    @Test
    public void testCountCharacterMatchAnyCase() {
        //ARRANGE

        //ACT

        //ASSERT

    }


    IApplication Application;

    //STUDENTS: DO NOT ALTER ANY LINES OF CODE UNDER THIS LINE
    public ApplicationTest(boolean runWithWorkingVersion) {
        if (runWithWorkingVersion) {
            this.Application = new Application_Working();
        }
        else {
            this.Application = new Application_WithBugs();
        }
    }

}

