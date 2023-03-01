package com.kenzie.intro;

import java.util.HashMap;
import java.util.ArrayList;

public class AssignmentTracker {
    //Define class properties here
    private String assignment;
    private int totalPoints;
    private HashMap<String, Integer> assignmentGradeMap;

    //Constructors
    public AssignmentTracker() {
        //Constructor with no arguments

    }

    public AssignmentTracker(String assignment, int totalPoints){
        //Constructor with two arguments

    }

    public void setAssignment(String assignment) {
        //fill out method

    }

    public String getAssignment() {
        //fill out method
        return null;
    }

    public void setTotalPoints(int totalPoints) {
        //fill out method
        ;
    }

    public int getTotalPoints() {
        //fill out method
        return 0;
    }

    public HashMap<String, Integer> getAssignmentGradeMap() {
        //fill out method
        return null;
    }

    public void addGrade(String name, int grade) {
        //fill out method

    }

    public int checkGrade(String name){
        //fill out method
        return 0;
    }

    public void updateGrade(String name, int grade){
        //fill out method

    }

    public ArrayList<String> getGradesEqualOrBelow(int grade){
        //fill out method
        return null;
    }

    public ArrayList<String> getGradesEqualOrAbove(int grade){
        //fill out method
        return null;
    }
}