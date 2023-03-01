package com.kenzie.unittesting.gradingfiles;

public class TestResult {
    private boolean isSuccessful;
    private String message;

    public TestResult(boolean isSuccessful, String message) {
        this.isSuccessful = isSuccessful;
        this.message = message;
    }

    public boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    public String getMessage() {
        return this.message;
    }
}
