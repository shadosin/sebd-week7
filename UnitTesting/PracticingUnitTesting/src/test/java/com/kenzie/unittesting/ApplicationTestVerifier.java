package com.kenzie.unittesting;

import com.kenzie.unittesting.gradingfiles.ApplicationTestRunner;
import com.kenzie.unittesting.gradingfiles.TestResult;
import org.junit.runner.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.notification.Failure;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;


//STUDENTS: DO NOT ALTER ANY LINES OF CODE UNDER THIS LINE
public class ApplicationTestVerifier {

    // These validation tests will verify if the test correctly passes with a working file
    // Or if your test correctly fails with a broken file
    @Test
    public void ValidateTestAddGreetingContainsHello(){
        TestResult doesTestPassUsingBadClass = doesTestPass("testAddGreetingContainsHello", false);
        assertFalse(doesTestPassUsingBadClass.getIsSuccessful(), "When your test is run using the Application class that has bugs Application_WithBugs this test should fail but does not fail. Message: " + doesTestPassUsingBadClass.getMessage());

        TestResult doesTestPassUsingWorkingClass = doesTestPass("testAddGreetingContainsHello", true);
        assertTrue(doesTestPassUsingWorkingClass.getIsSuccessful(), "When your test is run using the Application class that does not have bugs, Application_Working this test should pass but does not pass. Message: " + doesTestPassUsingWorkingClass.getMessage());

    }

    // Write a test method to check that the addGreeting method returns the appropriate String
    @Test
    public void ValidateTestAddGreeting(){
        TestResult doesTestPassUsingBadClass = doesTestPass("testAddGreeting", false);
        assertFalse(doesTestPassUsingBadClass.getIsSuccessful(), "When your test is run using the Application class that has bugs Application_WithBugs this test should fail but does not fail. Message: " + doesTestPassUsingBadClass.getMessage());

        TestResult doesTestPassUsingWorkingClass = doesTestPass("testAddGreeting", true);
        assertTrue(doesTestPassUsingWorkingClass.getIsSuccessful(), "When your test is run using the Application class that does not have bugs, Application_Working this test should pass but does not pass. Message: " + doesTestPassUsingWorkingClass.getMessage());
    }

    // Write a test method to check that the addNumbers method works correctly
    @Test
    public void ValidateTestAddNumbers(){
        TestResult doesTestPassUsingBadClass = doesTestPass("testAddNumbers", false);
        assertFalse(doesTestPassUsingBadClass.getIsSuccessful(), "When your test is run using the Application class that has bugs Application_WithBugs this test should fail but does not fail. Message: " + doesTestPassUsingBadClass.getMessage());

        TestResult doesTestPassUsingWorkingClass = doesTestPass("testAddNumbers", true);
        assertTrue(doesTestPassUsingWorkingClass.getIsSuccessful(), "When your test is run using the Application class that does not have bugs, Application_Working this test should pass but does not pass. Message: " + doesTestPassUsingWorkingClass.getMessage());
    }

    // Write a test method to check that the countCharacter method can be called with letters
    @Test
    public void ValidateTestCountCharacterMatchLetters() {
        TestResult doesTestPassUsingBadClass = doesTestPass("testCountCharacterMatchLetters", false);
        assertFalse(doesTestPassUsingBadClass.getIsSuccessful(), "When your test is run using the Application class that has bugs Application_WithBugs this test should fail but does not fail. Message: " + doesTestPassUsingBadClass.getMessage());

        TestResult doesTestPassUsingWorkingClass = doesTestPass("testCountCharacterMatchLetters", true);
        assertTrue(doesTestPassUsingWorkingClass.getIsSuccessful(), "When your test is run using the Application class that does not have bugs, Application_Working this test should pass but does not pass. Message: " + doesTestPassUsingWorkingClass.getMessage());
    }

    // Test that countCharacter can be used to match punctuation characters
    @Test
    public void ValidateTestCountCharacterMatchPunctuation() {
        TestResult doesTestPassUsingBadClass = doesTestPass("testCountCharacterMatchPunctuation", false);
        assertFalse(doesTestPassUsingBadClass.getIsSuccessful(), "When your test is run using the Application class that has bugs Application_WithBugs this test should fail but does not fail. Message: " + doesTestPassUsingBadClass.getMessage());

        TestResult doesTestPassUsingWorkingClass = doesTestPass("testCountCharacterMatchPunctuation", true);
        assertTrue(doesTestPassUsingWorkingClass.getIsSuccessful(), "When your test is run using the Application class that does not have bugs, Application_Working this test should pass but does not pass. Message: " + doesTestPassUsingWorkingClass.getMessage());
    }

    // Edge case: Test that countCharacter can handle an empty string
    @Test
    public void ValidateTestCountCharactersEmptyString() {
        TestResult doesTestPassUsingBadClass = doesTestPass("testCountCharactersEmptyString", false);
        assertFalse(doesTestPassUsingBadClass.getIsSuccessful(), "When your test is run using the Application class that has bugs Application_WithBugs this test should fail but does not fail. Message: " + doesTestPassUsingBadClass.getMessage());

        TestResult doesTestPassUsingWorkingClass = doesTestPass("testCountCharactersEmptyString", true);
        assertTrue(doesTestPassUsingWorkingClass.getIsSuccessful(), "When your test is run using the Application class that does not have bugs, Application_Working this test should pass but does not pass. Message: " + doesTestPassUsingWorkingClass.getMessage());
    }

    // Edge case: Test that countCharacter can handle case-insensitive matching
    // Write this unit test first. When countCharacter fails this test -- then go and fix the countCharacter method in Main.java
    @Test
    public void ValidateTestCountCharacterMatchAnyCase() {
        TestResult doesTestPassUsingBadClass = doesTestPass("testCountCharacterMatchAnyCase", false);
        assertFalse(doesTestPassUsingBadClass.getIsSuccessful(), "When your test is run using the Application class that has bugs Application_WithBugs this test should fail but does not fail. Message: " + doesTestPassUsingBadClass.getMessage());

        TestResult doesTestPassUsingWorkingClass = doesTestPass("testCountCharacterMatchAnyCase", true);
        assertTrue(doesTestPassUsingWorkingClass.getIsSuccessful(), "When your test is run using the Application class that does not have bugs, Application_Working this test should pass but does not pass. Message: " + doesTestPassUsingWorkingClass.getMessage());
    }


    private static TestResult doesTestPass(String methodName, boolean useWorkingVersion) {
        HashMap<Boolean, String> hashMap = new HashMap<>();
        ApplicationTest applicationTest = new ApplicationTest(useWorkingVersion);
        Request request = Request.method(applicationTest.getClass(), methodName);
        Result result = new JUnitCore().run(request.runner(new ApplicationTestRunner(applicationTest.getClass(), useWorkingVersion)));
        for(Failure s : result.getFailures()) {
            if(s.getDescription().toString().contains(methodName)) {
                return new TestResult(false, s.getMessage());
            }
        }
        return new TestResult(true, "");
    }
}

