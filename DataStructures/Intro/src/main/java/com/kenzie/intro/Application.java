package com.kenzie.intro;

import java.util.HashMap;

public class Application {
    public static AssignmentTracker createHomeworkAssignmentTracker(){
        // TODO: fill in the method
        AssignmentTracker homeworkTracker = new AssignmentTracker("Homework 1", 100);
        homeworkTracker.addGrade("Lisa", 100);
        homeworkTracker.addGrade("Bart", 80);
        homeworkTracker.addGrade("Maggie", 0);
        homeworkTracker.addGrade("Homer", 75);
       return homeworkTracker;
    }

    public static AssignmentTracker changeGrade(AssignmentTracker homeworkTracker, String name, int points) {
        // TODO: fill in the method
        int currentGrade = homeworkTracker.checkGrade(name);
        if (currentGrade > 0 && currentGrade + points <= 100) {
            homeworkTracker.updateGrade(name, currentGrade + points);
        }else if(currentGrade > 0 && currentGrade + points >= 100){
            homeworkTracker.updateGrade(name, 100);
        }


        return homeworkTracker;
    }

    public static void main(String[] args) {
        AssignmentTracker homeworkGrades = createHomeworkAssignmentTracker();
        if (homeworkGrades != null) {
            System.out.println(homeworkGrades.getAssignmentGradeMap().entrySet());
            homeworkGrades = changeGrade(homeworkGrades,"Bart",10);
            System.out.println("Add 10 points to Bart: " + homeworkGrades.getAssignmentGradeMap().entrySet());
            homeworkGrades = changeGrade(homeworkGrades,"Bart",20);
            System.out.println("Add 20 points to Bart, max rule: " + homeworkGrades.getAssignmentGradeMap().entrySet());
            homeworkGrades = changeGrade(homeworkGrades,"Homer",-10);
            System.out.println("Minus 10 points to Homer: " + homeworkGrades.getAssignmentGradeMap().entrySet());
            homeworkGrades = changeGrade(homeworkGrades,"Maggie",20);
            System.out.println("Did not add 20 points to Maggie, zero rule: " + homeworkGrades.getAssignmentGradeMap().entrySet());
            homeworkGrades = changeGrade(homeworkGrades,"Lisa",20);
            System.out.println("Did not add 20 points to Lisa, total point rule: " + homeworkGrades.getAssignmentGradeMap().entrySet());
            System.out.println("These students have grades 50 or below:");
            System.out.println(homeworkGrades.getGradesEqualOrBelow(50));
            System.out.println("These students have grades 70 or above:");
            System.out.println(homeworkGrades.getGradesEqualOrAbove(70));
        }
    }
}