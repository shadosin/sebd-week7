package com.kenzie.intro;

import java.util.HashMap;
import java.util.ArrayList;

public class AssignmentTracker {

    // Define class properties here
    private String assignment;
    private int totalPoints;
    private HashMap<String , Integer> assignmentGradeMap;

    // Constructors
    public AssignmentTracker() {
        // Constructor with no arguments
        this.assignment = "null";
        this.totalPoints = 0;
        assignmentGradeMap = new HashMap<String, Integer>();
    }

    public AssignmentTracker(String assignment, int totalPoints){
        // Constructor with two arguments
        this.assignment = assignment;
        this.totalPoints = totalPoints;
        assignmentGradeMap = new HashMap<String, Integer>();
    }

    public void setAssignment(String assignment) {
        // Fill out method
        this.assignment = assignment;

    }

    public String getAssignment() {
        // Fill out method
        return assignment;
    }

    public void setTotalPoints(int totalPoints) {
        // Fill out method
    this.totalPoints = totalPoints;
    }

    public int getTotalPoints() {
        // Fill out method
        return totalPoints;
    }

    public HashMap<String, Integer> getAssignmentGradeMap() {
        // Fill out method
        return assignmentGradeMap;
    }

    public void addGrade(String name, int grade) {
        // Fill out method
    if(!assignmentGradeMap.containsKey(name)){
        assignmentGradeMap.put(name, grade);
        }
    }

    public int checkGrade(String name){
        // Fill out method
        if(assignmentGradeMap.containsKey(name)){
            return assignmentGradeMap.get(name);
        }else{
        return -1;}
    }

    public void updateGrade(String name, int grade){
        // Fill out method
        if(assignmentGradeMap.containsKey(name)){
            assignmentGradeMap.put(name, grade);
        }
    }

    public ArrayList<String> getGradesEqualOrBelow(int grade){
        // Fill out method
        ArrayList<String> studentsBelowGrade = new ArrayList<String>();
        for(String name: assignmentGradeMap.keySet()){
            int studentGrade = assignmentGradeMap.get(name);
            if(studentGrade <= grade){
                studentsBelowGrade.add(name);
            }
        }
        return studentsBelowGrade;
    }

    public ArrayList<String> getGradesEqualOrAbove(int grade){
        // Fill out method
        ArrayList<String> studentsAboveGrade = new ArrayList<String>();
        for(String name: assignmentGradeMap.keySet()){
            int studentGrade = assignmentGradeMap.get(name);
            if(studentGrade >= grade){
                studentsAboveGrade.add(name);
            }
        }
        return studentsAboveGrade;
    }

}