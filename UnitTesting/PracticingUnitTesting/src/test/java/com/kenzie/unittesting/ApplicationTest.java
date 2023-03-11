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

    // Write a test method to check that the addGreeting method contains "Hello" as the first five characters in the string
    // This first one has been done for you
    @Order(1)
    @Test
    public void testAddGreetingContainsHello() {
        // ARRANGE
        String nameForTesting = "Zack";
        String expectedResult = "Hello";

        // ACT
        String actualString = Application.addGreeting(nameForTesting);
        String stringToTest = actualString.substring(0,5);

        // ASSERT
        assertEquals(stringToTest, expectedResult);
    }

    // Write a test method to check that the addGreeting method contains the correct greeting
    @Order(2)
    @Test
    public void testAddGreeting(){
        // ARRANGE
        String testGreeting = "Dave";

        // ACT
        String actualString = Application.addGreeting(testGreeting);
        String expectedStringResult = "Hello " + testGreeting + "!";
        // ASSERT
        assertEquals(expectedStringResult, actualString);
    }

    // Write a test method to check that the addNumbers method works correctly
    @Order(3)
    @Test
    public void testAddNumbers(){
        // ARRANGE
        int test1 = 2;
        int test2 = 2;
        // ACT
        int actualResult = Application.addNumbers(test1, test2);
        int expectedResult = 4;
        // ASSERT
    assertEquals(actualResult, expectedResult);
    }

    // Write a test method to check that the countCharacter method
    // Can be called with alphabetic characters (letters)
    @Order(4)
    @Test
    public void testCountCharacterMatchLetters() {
        // ARRANGE
        char test = 'a';
        String testA = "I really like bananas";
        // ACT
        int actualResult = Application.countCharacter(test, testA);
        int expectedResult = 4;
        // ASSERT
        assertEquals(actualResult, expectedResult);

    }

    // Test that countCharacter can be used to match punctuation characters
    @Order(5)
    @Test
    public void testCountCharacterMatchPunctuation() {
        // ARRANGE
        char test = '!';
        String testA = "I! reAll!!y, ?!? lik!!e banAnas!";
        // ACT
        int actualResult = Application.countCharacter(test, testA);
        int expectedResult = 7;
        // ASSERT
        assertEquals(actualResult, expectedResult);

    }

    // Edge case: Test that countCharacter can handle an empty string
    @Order(6)
    @Test
    public void testCountCharactersEmptyString() {
        // ARRANGE
        char test = 'W';
        String testA = "";
        // ACT
        int actualResult = Application.countCharacter(test, testA);
        int expectedResult = 0;
        // ASSERT
        assertEquals(actualResult, expectedResult);

    }

    // Edge case: Test that countCharacter can handle case-insensitive matching
    @Order(7)
    @Test
    public void testCountCharacterMatchAnyCase() {
        // ARRANGE
        char test = 'a';
        String testA = "I reAlly like banAnas";
        // ACT
        int actualResult = Application.countCharacter(test, testA);
        int expectedResult = 4;
        // ASSERT
        assertEquals(actualResult, expectedResult);


    }


    IApplication Application;

    // STUDENTS: DO NOT ALTER ANY LINES OF CODE UNDER THIS LINE
    public ApplicationTest(boolean runWithWorkingVersion) {
        if (runWithWorkingVersion) {
            this.Application = new Application_Working();
        }
        else {
            this.Application = new Application_WithBugs();
        }
    }

}

