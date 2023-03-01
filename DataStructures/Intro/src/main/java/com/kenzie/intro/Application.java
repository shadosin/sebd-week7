package com.kenzie.intro;

public class Application {
    public static AssignmentTracker createHomeworkAssignmentTracker(){
        // TODO: fill in the method

        // Change to return AssignmentTracker when complete
        return null;
    }

    public static AssignmentTracker changeGrade(AssignmentTracker assignmentTracker, String name, int points){
        // TODO: fill in the method
        return null;
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