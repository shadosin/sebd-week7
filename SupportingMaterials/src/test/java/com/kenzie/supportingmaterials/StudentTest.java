package com.kenzie.supportingmaterials;

import org.junit.jupiter.api.Test;

import java.lang.reflect.*;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StudentTest {

    Object [] SINGLE_PARAMETER_CONSTRUCTOR_VALUES = {101};
    Class<?> [] SINGLE_PARAMETER_CONSTRUCTOR_TYPES = {int.class};

    String ClassName = "Student";

    @Order(1)
    @Test
    void classHasField_assignmentGrades_Test() {
        String fieldNameToFind = "assignmentGrades";
        String fieldType = "HashMap";

        try {
            getFieldValueInClassUsingReflection(fieldNameToFind, SINGLE_PARAMETER_CONSTRUCTOR_VALUES, SINGLE_PARAMETER_CONSTRUCTOR_TYPES);
            assertTrue(true);
        }
        catch (Exception e) {
            assertTrue(false, "Double check and make sure you have a field of type " + fieldType + " variable with the name " + fieldNameToFind + " in the " + ClassName + " class.");
        }
    }
    @Order(2)
    @Test
    void studentClass_assignmentField_usesPrivateModifier_Test() {
        String EXPECTED_MODIFIER = "PRIVATE";
        String fieldNameToFind = "assignmentGrades";
        String fieldType = "HashMap";

        try {
            getFieldValueInClassUsingReflection(fieldNameToFind, SINGLE_PARAMETER_CONSTRUCTOR_VALUES, SINGLE_PARAMETER_CONSTRUCTOR_TYPES);
            assertTrue(doesClassFieldUseCorrectModifier(fieldNameToFind, SINGLE_PARAMETER_CONSTRUCTOR_VALUES, SINGLE_PARAMETER_CONSTRUCTOR_TYPES, "PRIVATE"), "Please Double check that your field " + fieldNameToFind + " uses the " + EXPECTED_MODIFIER + "modifier.");
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: "+ fieldNameToFind + "of type " + fieldType + " in the " + ClassName + " class that has the " + EXPECTED_MODIFIER + " Modifier.");
        }
    }

    @Order(3)
    @Test
    void classHasField_studentId_Test() {
        String fieldNameToFind = "studentId";
        String fieldType = "int";

        try {
            getFieldValueInClassUsingReflection(fieldNameToFind, SINGLE_PARAMETER_CONSTRUCTOR_VALUES, SINGLE_PARAMETER_CONSTRUCTOR_TYPES);
            assertTrue(true);
        }
        catch (Exception e) {
            assertTrue(false, "Double check and make sure you have a field of type " + fieldType + " variable with the name " + fieldNameToFind + " in the " + ClassName + " class.");
        }
    }
    @Order(4)
    @Test
    void studentClass_studentIdField_usesPrivateModifier_Test() {
        String EXPECTED_MODIFIER = "PRIVATE";
        String fieldNameToFind = "studentId";
        String fieldType = "int";

        try {
            getFieldValueInClassUsingReflection(fieldNameToFind, SINGLE_PARAMETER_CONSTRUCTOR_VALUES, SINGLE_PARAMETER_CONSTRUCTOR_TYPES);
            assertTrue(doesClassFieldUseCorrectModifier(fieldNameToFind, SINGLE_PARAMETER_CONSTRUCTOR_VALUES, SINGLE_PARAMETER_CONSTRUCTOR_TYPES, "PRIVATE"), "Please Double check that your field " + fieldNameToFind + " uses the " + EXPECTED_MODIFIER + "modifier.");
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: "+ fieldNameToFind + "of type " + fieldType + " in the " + ClassName + " class that has the " + EXPECTED_MODIFIER + " Modifier.");
        }
    }

    @Order(5)
    @Test
    void studentClass_zeroParameterConstructor_Exists() {
        try {
            Class<Student> studentClass = Student.class;
            Constructor<Student> cons = studentClass.getConstructor(SINGLE_PARAMETER_CONSTRUCTOR_TYPES);
            Student instance = cons.newInstance(SINGLE_PARAMETER_CONSTRUCTOR_VALUES);

        } catch (Exception e) {
            System.out.println(e.toString());
            fail("The Student class should have a 1 parameter constructor");
        }
    }

    @Order(6)
    @Test
    void studentClass_assignmentField_Getter_Exists() {
        try {
            Method getAssignmentGrades =  Student.class.getMethod("getAssignmentGrades");

            assertTrue(true);
        }
        catch(Exception e) {
            assertTrue(false, "Please double check your Student Class has the correct Constructors and that your class also has a getter and setter method for getAssignmentGrades.");
        }
    }

    @Order(7)
    @Test
    void studentClass_studentIdField_Getter_Exists() {
        try {
            Method getStudentId =  Student.class.getMethod("getStudentId");

            assertTrue(true);
        }
        catch(Exception e) {
            assertTrue(false, "Please double check your Student Class has the correct Constructors and that your class also has a getter and setter method for getStudentId.");
        }
    }

    @Order(8)
    @Test
    void studentClass_AllMethods_ExcludingGettersAndSetters_Exist() {
        try {
            Method addGrade =  Student.class.getMethod("addGrade", String.class, int.class);

            assertTrue(true);
        }
        catch(Exception e) {
            assertTrue(false, "Please double check your Student Class has the correct Constructors and that you have methods for addGrade in your Students Class. This excludes getter and setter methods for this test.");
        }
    }

    @Order(9)
    @Test
    public void testStudentEqualityReflexivity(){
        Integer randomInt1 = getRandomIntegerInRange(1,100);

        Student e1 = new Student(randomInt1);
        assertTrue(e1.equals(e1));
    }

    @Order(10)
    @Test
    public void testStudentEqualitySymmetry(){
        Integer randomInt1 = getRandomIntegerInRange(1,100);

        Student e1 = new Student(randomInt1);
        Student e2 = new Student(randomInt1);
        assertTrue(e1.equals(e2));
        assertTrue(e2.equals(e1));
    }

    @Order(11)
    @Test
    public void testStudentEqualityTransitivity(){
        Integer randomInt1 = getRandomIntegerInRange(1,100);

        Student e1 = new Student(randomInt1);
        Student e2 = new Student(randomInt1);
        Student e3 = new Student(randomInt1);
        assertTrue(e1.equals(e2));
        assertTrue(e2.equals(e3));
        assertTrue(e1.equals(e3));
    }

    @Order(12)
    @Test
    public void testStudentEqualityConsistency(){
        Integer randomInt1 = getRandomIntegerInRange(1,100);
        Integer randomInt2 = getRandomIntegerInRange(1,100);

        Student e1 = new Student(randomInt1);
        Student e2 = new Student(randomInt1);
        assertTrue(e1.equals(e2));
        assertTrue(e1.equals(e2));

        e1 = new Student(randomInt2);
        e2 = new Student(randomInt2);
        assertTrue(e1.equals(e2));
        assertTrue(e1.equals(e2));
    }

    @Order(13)
    @Test
    public void testStudentEqualityNonNullity(){
        Student e1 = new Student(1);
        assertFalse(e1.equals(null));
    }


    @Order(14)
    @Test
    public void testStudentEqualityNotEqual(){
        Integer randomInt1 = getRandomIntegerInRange(1,10000);
        Integer randomInt2 = getRandomIntegerInRange(1,10000);

        Student e1 = new Student(randomInt1);
        Student e2 = new Student(randomInt2);
        assertFalse(e1.equals(e2));
    }

    @Order(15)
    @Test
    public void testStudentEqualityRealObjects(){
        Integer randomInt1 = getRandomIntegerInRange(1,10000);
        Integer randomInt2 = getRandomIntegerInRange(1,100);
        Integer randomInt3 = getRandomIntegerInRange(1,100);
        Integer randomInt4 = getRandomIntegerInRange(1,100);

        String randomString1 = getRandomString(12);
        String randomString2 = getRandomString(12);
        String randomString3 = getRandomString(12);

        Student e1 = new Student(randomInt1);
        e1.addGrade(randomString1, randomInt2);
        e1.addGrade(randomString2, randomInt3);
        e1.addGrade(randomString3, randomInt4);

        Student e2 = new Student(randomInt1);
        e2.addGrade(randomString1, randomInt2);
        e2.addGrade(randomString2, randomInt3);
        e2.addGrade(randomString3, randomInt4);

        assertTrue(e1.equals(e2));
    }

    private String getRandomString(int lengthOfUsername) {
        String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder stringBuilder = new StringBuilder();
        Random rnd = new Random();
        while (stringBuilder.length() < lengthOfUsername) { // length of the random string.
            int index = (int) (rnd.nextFloat() * CHARS.length());
            stringBuilder.append(CHARS.charAt(index));
        }

        return stringBuilder.toString().toLowerCase();
    }

    private int getRandomIntegerInRange(int rangeMin, int rangeMax) {
        Random r = new Random();
        int randomInRangeInteger = rangeMin + (rangeMax - rangeMin) * r.nextInt();
        return randomInRangeInteger;
    }

    private String getFieldValueInClassUsingReflection(String variableName, Object[] params, Class<?> [] paramTypes) {
        try {
            Class<Student> myClass = Student.class;

            Constructor studentConstructor = myClass.getConstructor(paramTypes);
            Student student = (Student) studentConstructor.newInstance(params);

            Field field = myClass.getDeclaredField(variableName);
            Object fieldType = field.getType();

            field.setAccessible(true);

            String fieldTypeToString = field.get(student).toString();

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

    private boolean doesClassFieldUseCorrectModifier(String variableName, Object[] params, Class<?> [] paramTypes, String expectedModifier) {
        try {
            if(paramTypes == null || expectedModifier == null || expectedModifier.isEmpty() || expectedModifier.isBlank() ) {
                throw new Exception("paramTypes and expectedModifier parameters must be provided and must be valid.");
            }

            Class<Student> myClass = Student.class;

            Constructor constructor = myClass.getConstructor(paramTypes);
            Student student = (Student) constructor.newInstance(params);

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