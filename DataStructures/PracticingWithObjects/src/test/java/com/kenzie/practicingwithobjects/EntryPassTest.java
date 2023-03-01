package com.kenzie.practicingwithobjects;

import org.junit.jupiter.api.Test;
import java.lang.reflect.*;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EntryPassTest {

    Object [] EntryPassData2GeneralAccessId12345 = {"Homer", "12345"};

    Object [] EntryPassData2GeneralAccessId34567 = {"Homer", "34567"};
    Class<?> [] TwoParameterConstructorTypes = {String.class, String.class};

    Object [] EntryPassData1VIPAccess = {"Homer", "12345", "VIP"};
    Object [] EntryPassData1StandardAccess = {"Homer", "34567", "standard"};

    Class<?> [] ThreeParameterConstructorTypes = {String.class, String.class, String.class};

    String ClassName = "EntryPass";

    @Order(1)
    @Test
    void classHasField_name_Test() {
        String fieldNameToFind = "name";
        String fieldType = "String";

        try {
            getFieldValueInClassUsingReflection(fieldNameToFind, EntryPassData2GeneralAccessId12345, TwoParameterConstructorTypes);
            assertTrue(true);
        }
        catch (Exception e) {
            assertTrue(false, "Double check and make sure you have a field of type " + fieldType + " variable with the name " + fieldNameToFind + " in the " + ClassName + " class.");
        }
    }
    @Order(2)
    @Test
    void entryPassClass_nameField_usesPrivateModifier_Test() {
        String EXPECTED_MODIFIER = "PRIVATE";
        String fieldNameToFind = "name";
        String fieldType = "String";

        try {
            getFieldValueInClassUsingReflection(fieldNameToFind, EntryPassData2GeneralAccessId12345, TwoParameterConstructorTypes);
            assertTrue(doesClassFieldUseCorrectModifier(fieldNameToFind, EntryPassData2GeneralAccessId12345, TwoParameterConstructorTypes, "PRIVATE"), "Please Double check that your field " + fieldNameToFind + " uses the " + EXPECTED_MODIFIER + "modifier.");
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: "+ fieldNameToFind + "of type " + fieldType + " in the " + ClassName + " class that has the " + EXPECTED_MODIFIER + " Modifier.");
        }
    }

    @Order(3)
    @Test
    void classHasField_id_Test() {
        String fieldNameToFind = "id";
        String fieldType = "String";

        try {
            getFieldValueInClassUsingReflection(fieldNameToFind, EntryPassData2GeneralAccessId12345, TwoParameterConstructorTypes);
            assertTrue(true);
        }
        catch (Exception e) {
            assertTrue(false, "Double check and make sure you have a field of type " + fieldType + " variable with the name " + fieldNameToFind + " in the " + ClassName + " class.");
        }
    }

    @Order(4)
    @Test
    void entryPassClass_idField_usesPrivateModifier_Test() {
        String EXPECTED_MODIFIER = "PRIVATE";
        String fieldNameToFind = "id";
        String fieldType = "String";

        try {
            getFieldValueInClassUsingReflection(fieldNameToFind, EntryPassData2GeneralAccessId12345, TwoParameterConstructorTypes);
            assertTrue(doesClassFieldUseCorrectModifier(fieldNameToFind, EntryPassData2GeneralAccessId12345, TwoParameterConstructorTypes, "PRIVATE"), "Please Double check that your field " + fieldNameToFind + " uses the " + EXPECTED_MODIFIER + "modifier.");
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: "+ fieldNameToFind + "of type " + fieldType + " in the " + ClassName + " class that has the " + EXPECTED_MODIFIER + " Modifier.");
        }
    }

    @Order(5)
    @Test
    void classHasField_accessLevel_Test() {
        String fieldNameToFind = "accessLevel";
        String fieldType = "String";

        try {
            getFieldValueInClassUsingReflection(fieldNameToFind, EntryPassData2GeneralAccessId12345, TwoParameterConstructorTypes);
            assertTrue(true);
        }
        catch (Exception e) {
            assertTrue(false, "Double check and make sure you have a field of type " + fieldType + " variable with the name " + fieldNameToFind + " in the " + ClassName + " class.");
        }
    }

    @Order(6)
    @Test
    void entryPassClass_accessLevelField_usesPrivateModifier_Test() {
        String EXPECTED_MODIFIER = "PRIVATE";
        String fieldNameToFind = "accessLevel";
        String fieldType = "String";

        try {
            getFieldValueInClassUsingReflection(fieldNameToFind, EntryPassData2GeneralAccessId12345, TwoParameterConstructorTypes);
            assertTrue(doesClassFieldUseCorrectModifier(fieldNameToFind, EntryPassData2GeneralAccessId12345, TwoParameterConstructorTypes, "PRIVATE"), "Please Double check that your field " + fieldNameToFind + " uses the " + EXPECTED_MODIFIER + "modifier.");
        }
        catch (Exception e) {
            assertTrue(false, "Double check that you have a field called: "+ fieldNameToFind + "of type " + fieldType + " in the " + ClassName + " class that has the " + EXPECTED_MODIFIER + " Modifier.");
        }
    }

    @Order(7)
    @Test
    void entryPass_twoParameterConstructor_Exists() {
        try {
            String expectedName = "myname";
            String expectedId = "myid";
            String expectedAccessLevel = "general";

            Object [] params = {expectedName, expectedId};

            Class<EntryPass> entryPassClass = EntryPass.class;
            Constructor<EntryPass> cons = entryPassClass.getConstructor(TwoParameterConstructorTypes);
            EntryPass instance = cons.newInstance(params);

        } catch (Exception e) {
            System.out.println(e.toString());
            fail("The EntryPass class should have a 2 parameter constructor");
        }
    }

    @Order(8)
    @Test
    void entryPass_threeParameterConstructor_Exists() {
        try {
            String expectedName = "myname";
            String expectedId = "myid";
            String expectedAccessLevel = "standard";

            Object [] params = {expectedName, expectedId, expectedAccessLevel};

            Class<EntryPass> entryPassClass = EntryPass.class;
            Constructor<EntryPass> cons = entryPassClass.getConstructor(ThreeParameterConstructorTypes);
            EntryPass instance = cons.newInstance(params);

        } catch (Exception e) {
            System.out.println(e.toString());
            fail("The EntryPass class should have a 2 parameter constructor");
        }
    }

    @Order(9)
    @Test
    void entryPassClass_idField_GettersandSetters_Exist() {
        try {
            Method getId =  EntryPass.class.getMethod("getId");

            Method setId =  EntryPass.class.getMethod("setId", String.class);

            assertTrue(true);
        }
        catch(Exception e) {
            assertTrue(false, "Please double check your Entry Pass Class has the correct Constructors and that your class also has a getter and setter method for getId and setId.");
        }
    }
    @Order(10)
    @Test
    void entryPassClass_nameField_GettersandSetters_Exist() {
        try {
            Method getName =  EntryPass.class.getMethod("getName");

            Method setName =  EntryPass.class.getMethod("setName", String.class);

            assertTrue(true);
        }
        catch(Exception e) {
            assertTrue(false, "Please double check your Entry Pass Class has the correct Constructors and that your class also has a getter and setter method for getName and setName.");
        }
    }
    @Order(11)
    @Test
    void entryPassClass_accessLevelField_GettersandSetters_Exist() {
        try {
            Method getName =  EntryPass.class.getMethod("getAccessLevel");

            Method setName =  EntryPass.class.getMethod("setAccessLevel", String.class);

            assertTrue(true);
        }
        catch(Exception e) {
            assertTrue(false, "Please double check your Entry Pass Class has the correct Constructors and that your class also has a getter and setter method for getName and setName.");
        }
    }
    @Order(12)
    @Test
    public void testEntryPassEqualityReflexivity_Two_ParameterConstructor_Test() {
        try {
            Constructor entryPassConstructor = EntryPass.class.getConstructor(TwoParameterConstructorTypes);
            EntryPass e1 = (EntryPass) entryPassConstructor.newInstance(EntryPassData2GeneralAccessId12345);
            assertTrue(e1.equals(e1));
        } catch (Exception e) {
            System.out.println(e.toString());
            fail("EntryPass and all setter/getter methods must be defined");
        }
    }

    @Order(13)
    @Test
    public void testEntryPassEqualityReflexivity_Three_ParameterConstructor_Test() {
        try {
            Constructor entryPassConstructor = EntryPass.class.getConstructor(ThreeParameterConstructorTypes);
            EntryPass e1 = (EntryPass) entryPassConstructor.newInstance(EntryPassData1VIPAccess);
            assertTrue(e1.equals(e1));
        } catch (Exception e) {
            System.out.println(e.toString());
            fail("EntryPass and all setter/getter methods must be defined");
        }
    }

    @Order(14)
    @Test
    public void testEntryPassEqualitySymmetry_Two_ParameterConstructor_Test(){
        try {
            Constructor<EntryPass> entryPassConstructor = EntryPass.class.getConstructor(TwoParameterConstructorTypes);
            EntryPass e1 = (EntryPass) entryPassConstructor.newInstance(EntryPassData2GeneralAccessId12345);
            EntryPass e2 = (EntryPass) entryPassConstructor.newInstance(EntryPassData2GeneralAccessId12345);
            assertTrue(e1.equals(e2));
            assertTrue(e2.equals(e1));
        } catch (Exception e) {
            System.out.println(e.toString());
            fail("EntryPass and all setter/getter methods must be defined");
        }

    }
    @Order(15)
    @Test
    public void testEntryPassEqualitySymmetry_Three_ParameterConstructor_Test(){
        try {
            Constructor<EntryPass> entryPassConstructor = EntryPass.class.getConstructor(ThreeParameterConstructorTypes);
            EntryPass e1 = (EntryPass) entryPassConstructor.newInstance(EntryPassData1VIPAccess);
            EntryPass e2 = (EntryPass) entryPassConstructor.newInstance(EntryPassData1VIPAccess);
            assertTrue(e1.equals(e2));
            assertTrue(e2.equals(e1));
        } catch (Exception e) {
            System.out.println(e.toString());
            fail("EntryPass and all setter/getter methods must be defined");
        }

    }

    @Order(16)
    @Test
    public void testEntryPassEqualityTransitivity_Two_ParameterConstructor_Test(){
        try {
            Constructor<EntryPass> entryPassConstructor = EntryPass.class.getConstructor(TwoParameterConstructorTypes);
            EntryPass e1 = (EntryPass) entryPassConstructor.newInstance(EntryPassData2GeneralAccessId12345);
            EntryPass e2 = (EntryPass) entryPassConstructor.newInstance(EntryPassData2GeneralAccessId12345);
            EntryPass e3 = (EntryPass) entryPassConstructor.newInstance(EntryPassData2GeneralAccessId12345);
            assertTrue(e1.equals(e2));
            assertTrue(e2.equals(e3));
            assertTrue(e1.equals(e3));
        } catch (Exception e) {
            System.out.println(e.toString());
            fail("EntryPass and all setter/getter methods must be defined");
        }
    }

    @Order(17)
    @Test
    public void testEntryPassEqualityTransitivity_Three_ParameterConstructor_Test(){
        try {
            Constructor<EntryPass> entryPassConstructor = EntryPass.class.getConstructor(ThreeParameterConstructorTypes);
            EntryPass e1 = (EntryPass) entryPassConstructor.newInstance(EntryPassData1VIPAccess);
            EntryPass e2 = (EntryPass) entryPassConstructor.newInstance(EntryPassData1VIPAccess);
            EntryPass e3 = (EntryPass) entryPassConstructor.newInstance(EntryPassData1VIPAccess);
            assertTrue(e1.equals(e2));
            assertTrue(e2.equals(e3));
            assertTrue(e1.equals(e3));
        } catch (Exception e) {
            System.out.println(e.toString());
            fail("EntryPass and all setter/getter methods must be defined");
        }
    }

    @Order(18)
    @Test
    public void testEntryPassEqualityConsistency_Two_ParameterConstructor_Test(){
        try{
            Constructor<EntryPass> entryPassConstructor = EntryPass.class.getConstructor(TwoParameterConstructorTypes);
            EntryPass e1 = (EntryPass) entryPassConstructor.newInstance(EntryPassData2GeneralAccessId12345);
            EntryPass e2 = (EntryPass) entryPassConstructor.newInstance(EntryPassData2GeneralAccessId12345);
            assertTrue(e1.equals(e2));
            assertTrue(e1.equals(e2));

            e1 = (EntryPass) entryPassConstructor.newInstance(EntryPassData2GeneralAccessId12345);
            e2 = (EntryPass) entryPassConstructor.newInstance(EntryPassData2GeneralAccessId12345);
            assertTrue(e1.equals(e2));
            assertTrue(e1.equals(e2));
        } catch (Exception e) {
            System.out.println(e.toString());
            fail("EntryPass and all setter/getter methods must be defined");
        }
    }

    @Order(19)
    @Test
    public void testEntryPassEqualityConsistency_Three_ParameterConstructor_Test(){
        try{
            Constructor<EntryPass> entryPassConstructor = EntryPass.class.getConstructor(ThreeParameterConstructorTypes);
            EntryPass e1 = (EntryPass) entryPassConstructor.newInstance(EntryPassData1VIPAccess);
            EntryPass e2 = (EntryPass) entryPassConstructor.newInstance(EntryPassData1VIPAccess);
            assertTrue(e1.equals(e2));
            assertTrue(e1.equals(e2));

            e1 = (EntryPass) entryPassConstructor.newInstance(EntryPassData1VIPAccess);
            e2 = (EntryPass) entryPassConstructor.newInstance(EntryPassData1VIPAccess);
            assertTrue(e1.equals(e2));
            assertTrue(e1.equals(e2));
        } catch (Exception e) {
            System.out.println(e.toString());
            fail("EntryPass and all setter/getter methods must be defined");
        }
    }

    @Order(20)
    @Test
    public void testEntryPassEqualityNonNullity_Two_ParameterConstructor_Test(){
        try{
            Constructor<EntryPass> entryPassConstructor = EntryPass.class.getConstructor(TwoParameterConstructorTypes);
            EntryPass e1 = (EntryPass) entryPassConstructor.newInstance(EntryPassData2GeneralAccessId34567);
            assertFalse(e1.equals(null));
        } catch (Exception e) {
            System.out.println(e.toString());
            fail("EntryPass and all setter/getter methods must be defined");
        }
    }

    @Order(21)
    @Test
    public void testEntryPassEqualityNonNullity_Three_ParameterConstructor_Test(){
        try{
            Constructor<EntryPass> entryPassConstructor = EntryPass.class.getConstructor(ThreeParameterConstructorTypes);
            EntryPass e1 = (EntryPass) entryPassConstructor.newInstance(EntryPassData1VIPAccess);
            assertFalse(e1.equals(null));
        } catch (Exception e) {
            System.out.println(e.toString());
            fail("EntryPass and all setter/getter methods must be defined");
        }
    }

    @Order(22)
    @Test
    public void testEntryPassEqualityNotEqual_Two_ParameterConstructor_Test(){
        try {
            Constructor<EntryPass> entryPassConstructor = EntryPass.class.getConstructor(TwoParameterConstructorTypes);
            EntryPass e1 = (EntryPass) entryPassConstructor.newInstance(EntryPassData2GeneralAccessId12345);
            EntryPass e2 = (EntryPass) entryPassConstructor.newInstance(EntryPassData2GeneralAccessId34567);
            assertFalse(e1.equals(e2));
        } catch (Exception e) {
            System.out.println(e.toString());
            fail("EntryPass and all setter/getter methods must be defined");
        }
    }

    @Order(23)
    @Test
    public void testEntryPassEqualityNotEqual_Three_ParameterConstructor_Test(){
        try {
            Constructor<EntryPass> entryPassConstructor = EntryPass.class.getConstructor(ThreeParameterConstructorTypes);
            EntryPass e1 = (EntryPass) entryPassConstructor.newInstance(EntryPassData1VIPAccess);
            EntryPass e2 = (EntryPass) entryPassConstructor.newInstance(EntryPassData1StandardAccess);
            assertFalse(e1.equals(e2));
        } catch (Exception e) {
            System.out.println(e.toString());
            fail("EntryPass and all setter/getter methods must be defined");
        }
    }


    private String getFieldValueInClassUsingReflection(String variableName, Object[] params, Class<?> [] paramTypes) {
        try {
            Class<EntryPass> myClass = EntryPass.class;

            Constructor entryPassConstructor = myClass.getConstructor(paramTypes);
            EntryPass entryPass = (EntryPass) entryPassConstructor.newInstance(params);

            Field field = myClass.getDeclaredField(variableName);
            Object fieldType = field.getType();

            field.setAccessible(true);

            return field.get(entryPass).toString();

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

            Class<EntryPass> myClass = EntryPass.class;

            Constructor constructor = myClass.getConstructor(paramTypes);
            EntryPass entryPass = (EntryPass) constructor.newInstance(params);

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