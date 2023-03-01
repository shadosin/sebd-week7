package com.kenzie.intro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.reflect.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ApplicationTest {

    static final Object[] ZERO_PARAMETER_CONSTRUCTOR_VALUES = {};
    static final Class<?>[] ZERO_PARAMETER_CONSTRUCTOR_TYPES = {};

    static final Object[] TWO_PARAMETER_CONSTRUCTOR_VALUES = {"Jose", 100};
    static final Class<?>[] TWO_PARAMETER_CONSTRUCTOR_TYPES = {String.class, int.class};

    static final String CLASS_NAME = "AssignmentTracker";

    @Order(1)
    @Test
    void classHasField_assignment() {
        String fieldNameToFind = "assignment";
        String fieldType = "String";

        try {
            getFieldValueInAssignmentTrackerClassUsingReflection(fieldNameToFind, TWO_PARAMETER_CONSTRUCTOR_VALUES, TWO_PARAMETER_CONSTRUCTOR_TYPES);
            assertTrue(true);
        }
        catch (Exception e) {
            assertTrue(false, "Double check and make sure you have a field of type " + fieldType + " variable with the name " + fieldNameToFind + " in the " + CLASS_NAME + " class.");
        }
    }
    @Order(2)
    @Test
    void classHasField_assignment_private() {
        String EXPECTED_MODIFIER = "PRIVATE";
        String fieldNameToFind = "assignment";
        String fieldType = "String";

        try {
            getFieldValueInAssignmentTrackerClassUsingReflection(fieldNameToFind, TWO_PARAMETER_CONSTRUCTOR_VALUES, TWO_PARAMETER_CONSTRUCTOR_TYPES);
            assertTrue(doesClassFieldUseCorrectModifier(fieldNameToFind, TWO_PARAMETER_CONSTRUCTOR_VALUES, TWO_PARAMETER_CONSTRUCTOR_TYPES, "PRIVATE"), "Please Double check that your field " + fieldNameToFind + " uses the " + EXPECTED_MODIFIER + "modifier.");
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: " + fieldNameToFind + "of type " + fieldType + " in the " + CLASS_NAME + " class that has the " + EXPECTED_MODIFIER + " Modifier.");
        }
    }

    @Order(3)
    @Test
    void classHasField_totalPoints() {
        String fieldNameToFind = "totalPoints";
        String fieldType = "int";

        try {
            getFieldValueInAssignmentTrackerClassUsingReflection(fieldNameToFind, ZERO_PARAMETER_CONSTRUCTOR_VALUES, ZERO_PARAMETER_CONSTRUCTOR_TYPES);
            assertTrue(true);
        }
        catch (Exception e) {
            assertTrue(false, "Double check and make sure you have a field of type " + fieldType + " variable with the name " + fieldNameToFind + " in the " + CLASS_NAME + " class.");
        }
    }

    @Order(4)
    @Test
    void classHasField_totalPoints_private() {
        String EXPECTED_MODIFIER = "PRIVATE";
        String fieldNameToFind = "totalPoints";
        String fieldType = "int";

        try {
            getFieldValueInAssignmentTrackerClassUsingReflection(fieldNameToFind, ZERO_PARAMETER_CONSTRUCTOR_VALUES, ZERO_PARAMETER_CONSTRUCTOR_TYPES);
            assertTrue(doesClassFieldUseCorrectModifier(fieldNameToFind, ZERO_PARAMETER_CONSTRUCTOR_VALUES, ZERO_PARAMETER_CONSTRUCTOR_TYPES, "PRIVATE"), "Please Double check that your field " + fieldNameToFind + " uses the " + EXPECTED_MODIFIER + "modifier.");
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: " + fieldNameToFind + "of type " + fieldType + " in the " + CLASS_NAME + " class that has the " + EXPECTED_MODIFIER + " Modifier.");
        }
    }

    @Order(5)
    @Test
    void classHasField_assignmentGradeMap() {
        String fieldNameToFind = "assignmentGradeMap";
        String fieldType = "HashMap";

        try {
            getFieldValueInAssignmentTrackerClassUsingReflection(fieldNameToFind, ZERO_PARAMETER_CONSTRUCTOR_VALUES, ZERO_PARAMETER_CONSTRUCTOR_TYPES);
            assertTrue(true);
        }
        catch (Exception e) {
            assertTrue(false, "Double check and make sure you have a field of type " + fieldType + " variable with the name " + fieldNameToFind + " in the " + CLASS_NAME + " class.");
        }
    }

    @Order(6)
    @Test
    void classHasField_assignmentGradeMap_private() {
        String EXPECTED_MODIFIER = "PRIVATE";
        String fieldNameToFind = "assignmentGradeMap";
        String fieldType = "HashMap";

        try {
            getFieldValueInAssignmentTrackerClassUsingReflection(fieldNameToFind, ZERO_PARAMETER_CONSTRUCTOR_VALUES, ZERO_PARAMETER_CONSTRUCTOR_TYPES);
            assertTrue(doesClassFieldUseCorrectModifier(fieldNameToFind, ZERO_PARAMETER_CONSTRUCTOR_VALUES, ZERO_PARAMETER_CONSTRUCTOR_TYPES, "PRIVATE"), "Please Double check that your field " + fieldNameToFind + " uses the " + EXPECTED_MODIFIER + "modifier.");
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: " + fieldNameToFind + "of type " + fieldType + " in the " + CLASS_NAME + " class that has the " + EXPECTED_MODIFIER + " Modifier.");
        }
    }

    @Order(7)
    @Test
    void assignmentTrackerClass_zeroParameterConstructor_Exists() {
        try {
            Class<AssignmentTracker> entryPassClass = AssignmentTracker.class;
            Constructor<AssignmentTracker> cons = entryPassClass.getConstructor(ZERO_PARAMETER_CONSTRUCTOR_TYPES);
            AssignmentTracker instance = cons.newInstance(ZERO_PARAMETER_CONSTRUCTOR_VALUES);

        } catch (Exception e) {
            System.out.println(e.toString());
            fail("The AssignmentTracker class should have a zero parameter constructor");
        }
    }

    @Order(8)
    @Test
    void assignmentTrackerClass_twoParameterConstructor_Exists() {
        try {
            Class<AssignmentTracker> entryPassClass = AssignmentTracker.class;
            Constructor<AssignmentTracker> cons = entryPassClass.getConstructor(TWO_PARAMETER_CONSTRUCTOR_TYPES);
            AssignmentTracker instance = cons.newInstance(TWO_PARAMETER_CONSTRUCTOR_VALUES);

        } catch (Exception e) {
            System.out.println(e.toString());
            fail("The AssignmentTracker class should have a 2 parameter constructor");
        }
    }

    @Order(9)
    @Test
    void assignmentTrackerClass_assignmentField_GettersandSetters() {
        try {
            Method getAssignment =  AssignmentTracker.class.getMethod("getAssignment");

            Method setAssignment =  AssignmentTracker.class.getMethod("setAssignment", String.class);

        }
        catch(Exception e) {
            assertTrue(false, "Please double check your AssignmentTracker Class has the correct Constructors and that your class also has a getter and setter method for getAssignment and setAssignment.");
        }

        try {

            Class<AssignmentTracker> studentClass = AssignmentTracker.class;
            Constructor<AssignmentTracker> cons = studentClass.getConstructor(ZERO_PARAMETER_CONSTRUCTOR_TYPES);
            AssignmentTracker instance = cons.newInstance(ZERO_PARAMETER_CONSTRUCTOR_VALUES);

            Method setAssignment = AssignmentTracker.class.getMethod("setAssignment", String.class);
            setAssignment.invoke(instance, "Exam 1");


            @SuppressWarnings("unchecked")
            Method getAssignment = AssignmentTracker.class.getMethod("getAssignment");
            @SuppressWarnings("unchecked")
            String assignmentValue = (String) getAssignment.invoke(instance);
            assertEquals("Exam 1", assignmentValue, "Assignment value was not updated. Double check getters and setters for 'assignment'");

        }
        catch(Exception e) {
            assertTrue(false, "Please double check your AssignmentTracker Class has the correct Constructors and that your class also has a getter and setter method for getAssignment and setAssignment.");
        }
    }
    @Order(10)
    @Test
    void assignmentTrackerClass_totalPointsField_GettersandSetters() {
        try {
            Method getTotalPoints =  AssignmentTracker.class.getMethod("getTotalPoints");

            Method setTotalPoints =  AssignmentTracker.class.getMethod("setTotalPoints", int.class);


        }
        catch(Exception e) {
            assertTrue(false, "Please double check your AssignmentTracker Class has the correct Constructors and that your class also has a getter and setter method for getTotalPoints and setTotalPoints.");
        }

        try {

            Class<AssignmentTracker> studentClass = AssignmentTracker.class;
            Constructor<AssignmentTracker> cons = studentClass.getConstructor(ZERO_PARAMETER_CONSTRUCTOR_TYPES);
            AssignmentTracker instance = cons.newInstance(ZERO_PARAMETER_CONSTRUCTOR_VALUES);

            @SuppressWarnings("unchecked")
            Method setTotalPoints = AssignmentTracker.class.getMethod("setTotalPoints", int.class);
            setTotalPoints.invoke(instance, 60);

            @SuppressWarnings("unchecked")
            Method getTotalPoints = AssignmentTracker.class.getMethod("getTotalPoints");
            @SuppressWarnings("unchecked")
            int totalPointsValue = (int) getTotalPoints.invoke(instance);
            assertEquals(60, totalPointsValue, "Total points not set. Expected value: 60");


        }
        catch(Exception e) {
            assertTrue(false, "Please double check your AssignmentTracker Class has the correct Constructors and that your class also has a getter and setter method for getAssignment and setAssignment.");
        }
    }

    @Order(11)
    @Test
    void assignmentTrackerClass_assignmentGradeMapField_Getter() {
        try {
            Method getAssignmentGradeMap =  AssignmentTracker.class.getMethod("getAssignmentGradeMap");

            assertTrue(true);
        }
        catch(Exception e) {
            assertTrue(false, "Please double check your AssignmentTracker Class has the correct Constructors and that your class also has a getter and setter method for getAssignmentGradeMap");
        }
        try {

            Class<AssignmentTracker> studentClass = AssignmentTracker.class;
            Constructor<AssignmentTracker> cons = studentClass.getConstructor(ZERO_PARAMETER_CONSTRUCTOR_TYPES);
            AssignmentTracker instance = cons.newInstance(ZERO_PARAMETER_CONSTRUCTOR_VALUES);

            @SuppressWarnings("unchecked")
            Method getAssignmentGradeMap = AssignmentTracker.class.getMethod("getAssignmentGradeMap");
            @SuppressWarnings("unchecked")
            HashMap assignmentGradeMapValue = (HashMap) getAssignmentGradeMap.invoke(instance);
            assertNotNull(assignmentGradeMapValue, "Be sure to initialize the HashMap in your constructor!");

        }
        catch(Exception e) {
            assertTrue(false, "Please double check your AssignmentTracker Class has the correct Constructors and that your class also has a getter and setter method for getAssignment and setAssignment.");
        }
    }

    @Order(12)
    @Test
    void assignmentTrackerClass_AllMethods_ExcludingGettersAndSetters_Exist() {
        try {
            Method addGrade =  AssignmentTracker.class.getMethod("addGrade", String.class, int.class);

            Method checkGrade =  AssignmentTracker.class.getMethod("checkGrade", String.class);

            Method updateGrade =  AssignmentTracker.class.getMethod("updateGrade", String.class, int.class);

            Method getGradesEqualOrBelow =  AssignmentTracker.class.getMethod("getGradesEqualOrBelow", int.class);

            Method getGradesEqualOrAbove =  AssignmentTracker.class.getMethod("getGradesEqualOrAbove", int.class);

            assertTrue(true);
        }
        catch(Exception e) {
            assertTrue(false, "Please double check your AssignmentTracker Class has the correct Constructors and that you have methods for hunt and eat in your Assignment Tracker Class. This excludes getter and setter methods for this test.");
        }
    }

    @DisplayName("AssignmentTracker objects have been created")
    @Order(13)
    @Test
    public void testCreateHomeworkAssignmentTracker_AssignmentsCreated() {
        try {
            @SuppressWarnings("unchecked")
            AssignmentTracker homeworkGrades = Application.createHomeworkAssignmentTracker();
            assertNotNull(homeworkGrades, "Reason: returned null instead of AssignmentTracker object");

            @SuppressWarnings("unchecked")
            Method getAssignment = AssignmentTracker.class.getMethod("getAssignment");
            @SuppressWarnings("unchecked")
            String assignmentValue = (String) getAssignment.invoke(homeworkGrades);
            assertEquals("Homework 1", assignmentValue, "Assignment value is not set. Expected value: Homework 1");

            @SuppressWarnings("unchecked")
            Method getTotalPoints = AssignmentTracker.class.getMethod("getTotalPoints");
            @SuppressWarnings("unchecked")
            int totalPointsValue = (int) getTotalPoints.invoke(homeworkGrades);
            assertEquals(100, totalPointsValue, "Total points not set. Expected value: 100");

            @SuppressWarnings("unchecked")
            Method getAssignmentGradeMap = AssignmentTracker.class.getMethod("getAssignmentGradeMap");
            @SuppressWarnings("unchecked")
            HashMap assignmentGradeMapValue = (HashMap) getAssignmentGradeMap.invoke(homeworkGrades);

            assertNotNull(assignmentGradeMapValue.get("Bart"), "Entry for key: Bart missing");
            assertNotNull(assignmentGradeMapValue.get("Lisa"), "Entry for key: Lisa missing");
            assertNotNull(assignmentGradeMapValue.get("Maggie"), "Entry for key: Maggie missing");
            assertNotNull(assignmentGradeMapValue.get("Homer"), "Entry for key: Homer missing");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            fail("AssignmentTracker and all setter/getter methods must be defined");
        }
    }

    @DisplayName("AssignmentTracker has correct grades")
    @Order(15)
    @Test
    public void testCreateHomeworkAssignmentTracker_AssignmentTrackerObjectHasCorrectAssignmentGrades() {
        try {
            @SuppressWarnings("unchecked")
            AssignmentTracker homeworkGrades = Application.createHomeworkAssignmentTracker();
            assertNotNull(homeworkGrades, "Reason: returned null instead of AssignmentTracker object");

            @SuppressWarnings("unchecked")
            Method getAssignmentGradeMap = AssignmentTracker.class.getMethod("getAssignmentGradeMap");
            @SuppressWarnings("unchecked")
            HashMap assignmentGradeMapValue = (HashMap) getAssignmentGradeMap.invoke(homeworkGrades);
            @SuppressWarnings("unchecked")
            int HomerGrade = (int) assignmentGradeMapValue.getOrDefault("Homer", -1);
            @SuppressWarnings("unchecked")
            int MaggieGrade = (int) assignmentGradeMapValue.getOrDefault("Maggie", -1);
            @SuppressWarnings("unchecked")
            int BartGrade = (int) assignmentGradeMapValue.getOrDefault("Bart", -1);
            @SuppressWarnings("unchecked")
            int LisaGrade = (int) assignmentGradeMapValue.getOrDefault("Lisa", -1);

            assertEquals(75, HomerGrade, "Test: Homer grade incorrect. Expected:75");
            assertEquals(0, MaggieGrade, "Test: Maggie incorrect. Expected:0");
            assertEquals(80, BartGrade, "Test: Bart incorrect. Expected:80");
            assertEquals(100, LisaGrade, "Test: Lisa incorrect. Expected:100");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            fail("All setter/getter methods must be defined");
        }
    }

    @DisplayName("AssignmentTracker has correct grades after changeGrade")
    @Order(16)
    @Test
    public void testCreateHomeworkAssignmentTracker_AssignmentTrackerObjectHasCorrectGradesAfterChange() {
        try {
            //Initialize AssignmentTracker -- does not rely on Main having correct initialization
            //check that required methods are defined
            @SuppressWarnings("unchecked")
            Constructor constructor = AssignmentTracker.class.getConstructor();

            @SuppressWarnings("unchecked")
            AssignmentTracker tempGrades = (AssignmentTracker) constructor.newInstance();

            @SuppressWarnings("unchecked")
            Method setTotalPoints = AssignmentTracker.class.getMethod("setTotalPoints", int.class);
            setTotalPoints.invoke(tempGrades, 100);

            @SuppressWarnings("unchecked")
            Method getAssignmentGradeMap = AssignmentTracker.class.getMethod("getAssignmentGradeMap");
            @SuppressWarnings("unchecked")
            HashMap<String,Integer> assignmentGradeMapValue = (HashMap<String,Integer>) getAssignmentGradeMap.invoke(tempGrades);
            assertNotNull(assignmentGradeMapValue, "Reason: returned null instead of AssignmentTracker object");

            @SuppressWarnings("unchecked")
            Method getAssignment = AssignmentTracker.class.getMethod("getAssignment");
            @SuppressWarnings("unchecked")
            String assignmentValue = (String) getAssignment.invoke(tempGrades);

            //set test values
            ((HashMap<String,Integer>)assignmentGradeMapValue).put("Cindy", 100);
            assignmentGradeMapValue.put("Andy", 80);
            assignmentGradeMapValue.put("Bob", 0);
            assignmentGradeMapValue.put("Jose", 75);

            Application.changeGrade(tempGrades, "Andy", 10);
            assertEquals(90, assignmentGradeMapValue.getOrDefault("Andy", -1), "Test: Points not added correctly");
            Application.changeGrade(tempGrades, "Andy", 20);
            assertEquals(100, assignmentGradeMapValue.getOrDefault("Andy", -1), "Test: Up to max points rule");
            Application.changeGrade(tempGrades, "Jose", -10);
            assertEquals(65, assignmentGradeMapValue.getOrDefault("Jose", -1), "Test: Minus points");
            Application.changeGrade(tempGrades, "Bob", 20);
            assertEquals(0, assignmentGradeMapValue.getOrDefault("Bob", -1), "Test: zero point rule");
            Application.changeGrade(tempGrades, "Cindy", 20);
            assertEquals(100, assignmentGradeMapValue.getOrDefault("Cindy", -1), "Test: max point rule");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            fail("All setter/getter methods must be defined");
        }
    }

    @DisplayName("AssignmentTracker return grades above or equal threshhold")
    @Order(17)
    @Test
    public void testCreateHomeworkAssignmentTracker_AssignmentTrackerObjectReturnsAboveOrEqual() {
        try {
            //Initialize AssignmentTracker -- does not rely on Main having correct initialization
            //check that required methods are defined
            @SuppressWarnings("unchecked")
            Constructor constructor = AssignmentTracker.class.getConstructor(String.class, int.class);

            @SuppressWarnings("unchecked")
            AssignmentTracker tempGrades = (AssignmentTracker) constructor.newInstance("Test Activity", 100);
            @SuppressWarnings("unchecked")
            Method getAssignmentGradeMap = AssignmentTracker.class.getMethod("getAssignmentGradeMap");
            @SuppressWarnings("unchecked")
            HashMap<String,Integer> assignmentGradeMapValue = (HashMap<String,Integer>) getAssignmentGradeMap.invoke(tempGrades);
            assertNotNull(assignmentGradeMapValue, "Reason: returned null instead of AssignmentTracker object");

            assignmentGradeMapValue.put("Cindy", 100);
            assignmentGradeMapValue.put("Andy", 80);
            assignmentGradeMapValue.put("Bob", 0);
            assignmentGradeMapValue.put("Jose", 75);

            @SuppressWarnings("unchecked")
            ArrayList<String> resultArray1 = new ArrayList<>();
            resultArray1.add("Andy");
            resultArray1.add("Cindy");

            @SuppressWarnings("unchecked")
            Method getGradesEqualOrAbove = AssignmentTracker.class.getMethod("getGradesEqualOrAbove", int.class);
            @SuppressWarnings("unchecked")
            ArrayList<String> resultsArray2 = (ArrayList<String>) getGradesEqualOrAbove.invoke(tempGrades, 80);
            assertNotNull(assignmentGradeMapValue, "Reason: returned null instead of AssignmentTracker object");
            Collections.sort(resultArray1);
            Collections.sort(resultsArray2);
            assertEquals(resultArray1, resultsArray2, "Test:Equal or above 80. Expected two matches.");

            @SuppressWarnings("unchecked")
            ArrayList<String> resultsArray3 = new ArrayList<>();
            @SuppressWarnings("unchecked")
            ArrayList<String> resultsArray4 = (ArrayList<String>) getGradesEqualOrAbove.invoke(tempGrades, 200);
            assertEquals(resultsArray3, resultsArray4, "Test:Equal or above 200. Expected:no matches");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            fail("All setter/getter methods must be defined");
        }
    }

    @DisplayName("AssignmentTracker return grades below or equal threshhold")
    @Order(18)
    @Test
    public void testCreateHomeworkAssignmentTracker_AssignmentTrackerObjectReturnsBelowOrEqual() {
        try {
            //Initialize AssignmentTracker -- does not rely on Main having correct initialization
            //check that required methods are defined
            @SuppressWarnings("unchecked")
            Constructor constructor = AssignmentTracker.class.getConstructor(String.class, int.class);

            @SuppressWarnings("unchecked")
            AssignmentTracker tempGrades = (AssignmentTracker) constructor.newInstance("Test Activity", 100);

            @SuppressWarnings("unchecked")
            Method getAssignmentGradeMap = AssignmentTracker.class.getMethod("getAssignmentGradeMap");
            @SuppressWarnings("unchecked")
            HashMap<String,Integer> assignmentGradeMapValue = (HashMap<String,Integer>) getAssignmentGradeMap.invoke(tempGrades);
            assertNotNull(assignmentGradeMapValue, "Reason: returned null instead of AssignmentTracker object");

            assignmentGradeMapValue.put("Cindy", 100);
            assignmentGradeMapValue.put("Andy", 80);
            assignmentGradeMapValue.put("Bob", 0);
            assignmentGradeMapValue.put("Jose", 75);

            @SuppressWarnings("unchecked")
            ArrayList<String> resultsArray1 = new ArrayList<>();
            resultsArray1.add("Jose");
            resultsArray1.add("Bob");

            @SuppressWarnings("unchecked")
            Method getGradesEqualOrBelow = AssignmentTracker.class.getMethod("getGradesEqualOrBelow", int.class);
            @SuppressWarnings("unchecked")
            ArrayList<String> resultsArray2 = (ArrayList<String>) getGradesEqualOrBelow.invoke(tempGrades, 75);
            assertNotNull(assignmentGradeMapValue, "Reason: returned null instead of AssignmentTracker object");
            Collections.sort(resultsArray1);
            Collections.sort(resultsArray2);
            assertEquals(resultsArray1, resultsArray2, "Test:Equal or below 80. Expected two matches.");

            @SuppressWarnings("unchecked")
            ArrayList<String> resultArray3 = new ArrayList<>();
            @SuppressWarnings("unchecked")
            ArrayList<String> resultsArray4 = (ArrayList<String>) getGradesEqualOrBelow.invoke(tempGrades, -1);

            assertEquals(resultArray3, resultsArray4, "Test: Equal or below no matches");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            fail("All setter/getter methods must be defined");

        }
    }
    private String getFieldValueInAssignmentTrackerClassUsingReflection(String variableName, Object[] params, Class<?>[] paramTypes) {
        try {
            Class<AssignmentTracker> myClass = AssignmentTracker.class;

            Constructor assignmentTrackerConstructor = myClass.getConstructor(paramTypes);
            AssignmentTracker assignmentTracker = (AssignmentTracker) assignmentTrackerConstructor.newInstance(params);

            Field field = myClass.getDeclaredField(variableName);
            Object fieldType = field.getType();

            field.setAccessible(true);

            if (field.get(assignmentTracker) == null){
                // System.out.println("Value is null");
                return "";
            }
            String fieldTypeToString = field.get(assignmentTracker).toString();

            return fieldTypeToString;

        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean doesClassFieldUseCorrectModifier(String variableName, Object[] params, Class<?>[] paramTypes, String expectedModifier) {
        try {
            if(paramTypes == null || expectedModifier == null || expectedModifier.isEmpty() || expectedModifier.isBlank() ) {
                throw new Exception("paramTypes and expectedModifier parameters must be provided and must be valid.");
            }

            Class<AssignmentTracker> myClass = AssignmentTracker.class;

            Constructor constructor = myClass.getConstructor(paramTypes);
            AssignmentTracker assignmentTracker = (AssignmentTracker) constructor.newInstance(params);

            Field field = myClass.getDeclaredField(variableName);
            Object fieldType = field.getType();

            int modifiers = field.getModifiers();

            String expectedModifierToLower = expectedModifier.toLowerCase();

            if(Modifier.isProtected(modifiers)) {
                if(expectedModifier.toLowerCase().equalsIgnoreCase("protected")) {
                    return true;
                }
            }
            else if(Modifier.isPrivate(modifiers)) {
                if(expectedModifier.toLowerCase().equalsIgnoreCase("private")) {
                    return true;
                }
            }
            else if(Modifier.isPublic(modifiers)) {
                if(expectedModifier.toLowerCase().equalsIgnoreCase("public")) {
                    return true;
                }
            }
            else if(Modifier.isAbstract(modifiers)) {
                if(expectedModifier.toLowerCase().equalsIgnoreCase("abstract")) {
                    return true;
                }
            }
            else if(Modifier.isFinal(modifiers)) {
                if(expectedModifier.toLowerCase().equalsIgnoreCase("final")) {
                    return true;
                }
            }
            else if(Modifier.isInterface(modifiers)) {
                if(expectedModifier.toLowerCase().equalsIgnoreCase("interface")) {
                    return true;
                }
            }
            else if(Modifier.isStatic(modifiers)) {
                if(expectedModifier.toLowerCase().equalsIgnoreCase("static")) {
                    return true;
                }
            }

        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }

}