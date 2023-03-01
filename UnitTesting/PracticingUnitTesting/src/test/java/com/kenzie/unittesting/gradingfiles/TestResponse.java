package com.kenzie.unittesting.gradingfiles;

public class TestResponse {
    private boolean testPassed = false;
    private String message = "";

    public TestResponse(boolean testPassed) {
        if (testPassed) {
            this.testPassed = testPassed;
            this.message = "TEST VERIFICATION RESPONSE: Your test passed successfully!";
        } else {
            this.testPassed = testPassed;
            this.message = "TEST VERIFICATION RESPONSE: Your test has failed.";
        }
    }

    public TestResponse(boolean testPassed, String message) {
        this.testPassed = testPassed;
        this.message = "TEST VERIFICATION RESPONSE: " + message;
    }

    public boolean getTestPassed() {
        return this.testPassed;
    }

    public void setTestPassed(boolean testPassed) {
        this.testPassed = testPassed;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = "TEST VERIFICATION RESPONSE: " + message;
    }
}
