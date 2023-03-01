package com.kenzie.supportingmaterials;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

class Student {
    private HashMap<String, Integer> assignmentGrades;
    private int studentId;

    public Student(int studentId) {
        this.assignmentGrades = new HashMap<>();
        this.studentId = studentId;
    }

    public int getStudentId() {
        return 0;
    }

    public HashMap<String, Integer> getAssignmentGrades() {
        return null;
    }

    public void addGrade(String name, int grade) {
        //fill out method
    }

    @Override
    public boolean equals(Object obj){
        return false;
    }
}
