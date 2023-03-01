package com.kenzie.practicingwithobjects;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ApplicationTest {

    Object [] homerVip = {"Homer", "12345", "VIP"};
    Object [] homerGeneral = {"Homer", "12345", "general"};
    Object [] maggieVip = {"Maggie","23456","VIP"};
    Object [] maggieVip2 = {"Maggie","12345","VIP"};
    Object [] maggieVipLowerCase = {"Maggie", "23456", "vip"};
    Object [] margeVip = {"Marge","34567","VIP"};
    Object [] margeGeneral = {"Marge", "34567", "general"};
    Object [] lisaVipLowerCase = {"Lisa","12345","vip"};

    Class<?> [] paramTypes = {String.class, String.class, String.class};
    HashMap<String, EntryPass> entryPassesByName = new HashMap<>();
    ArrayList<String> blockList = new ArrayList<>();

    @Order(1)
    @Test
    public void testEntryPass_Constructor(){
        try{
            Constructor entryPassConstructor = EntryPass.class.getConstructor(paramTypes);
            EntryPass entryPass = (EntryPass) entryPassConstructor.newInstance(homerVip);
            assertNotNull(entryPass);
        } catch (Exception e) {
            System.out.println(e.toString());
            fail("EntryPass and all setter/getter methods must be defined");
        }
    }

    @Order(2)
    @Test
    public void testAddPassIfUnique_CanAddOnePass(){

        entryPassesByName.clear();
        try {
            Constructor entryPassConstructor = EntryPass.class.getConstructor(paramTypes);
            EntryPass entryPass = (EntryPass) entryPassConstructor.newInstance(homerVip);
            Application.addPassIfUnique(entryPassesByName,entryPass);
            assertEquals(1, entryPassesByName.size(), "Test: Add one EntryPass to empty HashMap");
            assertNotNull(entryPassesByName.get("Homer12345"), "Test: Key set to name+id");
        }  catch (Exception e) {
            System.out.println(e.toString());
            fail("EntryPass and all setter/getter methods must be defined");
        }
    }

    @Order(3)
    @Test
    public void testAddPassIfUnique_CanAddMultiplePasses(){
        entryPassesByName.clear();
        try {
            Constructor entryPassConstructor = EntryPass.class.getConstructor(paramTypes);
            EntryPass entryPassHomer = (EntryPass) entryPassConstructor.newInstance(homerVip);
            Application.addPassIfUnique(entryPassesByName,entryPassHomer);
            EntryPass entryPassMaggie = (EntryPass) entryPassConstructor.newInstance(maggieVip);
            Application.addPassIfUnique(entryPassesByName,entryPassMaggie);
            EntryPass entryPassMarge = (EntryPass) entryPassConstructor.newInstance(margeVip);
            Application.addPassIfUnique(entryPassesByName,entryPassMarge);

            assertEquals(3, entryPassesByName.size(),"Test: Add multiple EntryPass to empty HashMap");

        } catch (Exception e) {
            System.out.println(e.toString());
            fail("EntryPass and all setter/getter methods must be defined");
        }
    }


    @Order(4)
    @Test
    public void testAddPassIfUnique_DuplicatePassNotAdded(){
        entryPassesByName.clear();
        try {
            Constructor entryPassConstructor = EntryPass.class.getConstructor(paramTypes);
            EntryPass entryPassHomer = (EntryPass) entryPassConstructor.newInstance(homerVip);
            Application.addPassIfUnique(entryPassesByName, entryPassHomer);

            EntryPass entryPassMaggie = (EntryPass) entryPassConstructor.newInstance(maggieVip2);
            Application.addPassIfUnique(entryPassesByName, entryPassMaggie);

            assertEquals(1, entryPassesByName.size(), "Test: Duplicate pass not added");
            assertNotNull(entryPassesByName.get("Homer12345"), "Test: Original EntryPass kept");

            EntryPass entryPassLisa = (EntryPass) entryPassConstructor.newInstance(lisaVipLowerCase);
            Application.addPassIfUnique(entryPassesByName, entryPassLisa);

            assertEquals(1, entryPassesByName.size(), "Test: Duplicate pass case-sensitive not added");
            assertNotNull(entryPassesByName.get("Homer12345"), "Test: Original EntryPass kept");
        } catch (Exception e) {
            System.out.println(e.toString());
            fail("EntryPass and all setter/getter methods must be defined");
        }
    }

    @Order(5)
    @Test
    public void testAddPassIfUnique_NewPassSameKeyUpdated(){
        entryPassesByName.clear();
        try {
            Constructor entryPassConstructor = EntryPass.class.getConstructor(paramTypes);
            EntryPass entryPassHomerVip = (EntryPass) entryPassConstructor.newInstance(homerVip);
            Application.addPassIfUnique(entryPassesByName, entryPassHomerVip);

            EntryPass entryPassHomerGeneral = (EntryPass) entryPassConstructor.newInstance(homerGeneral);
            Application.addPassIfUnique(entryPassesByName, entryPassHomerGeneral);

            assertEquals(1, entryPassesByName.size(), "Test: Duplicate key updates entry");
            assertNotNull(entryPassesByName.get("Homer12345"), "Test: Original key retained");
            EntryPass currentEntry = entryPassesByName.get("Homer12345");

            Method getAccessLevel = EntryPass.class.getMethod("getAccessLevel");
            String value = (String) getAccessLevel.invoke(currentEntry);
            assertEquals("general", value, "Test: accessLevel updated");
        } catch (Exception e) {
            System.out.println(e.toString());
            fail("EntryPass and all setter/getter methods must be defined");
        }
    }


    @Order(6)
    @Test
    public void testGetVIPList_VIPFound() {
        entryPassesByName.clear();

        try {
            Constructor entryPassConstructor = EntryPass.class.getConstructor(paramTypes);
            EntryPass entryPassHomerVip = (EntryPass) entryPassConstructor.newInstance(homerVip);
            EntryPass entryPassMaggieVip = (EntryPass) entryPassConstructor.newInstance(maggieVipLowerCase);
            EntryPass entryPassMargeGeneral = (EntryPass) entryPassConstructor.newInstance(margeGeneral);

            entryPassesByName.put("Homer12345", entryPassHomerVip);
            entryPassesByName.put("Maggie23456", entryPassMaggieVip);
            entryPassesByName.put("Marge34567", entryPassMargeGeneral);

            ArrayList<String> vipList = Application.getVIPList(entryPassesByName);
            ArrayList<String> expectedList = new ArrayList<>();
            expectedList.add("Homer");
            expectedList.add("Maggie");
            assertEquals(2, vipList.size(), "Test: Found vips in list");
            assertEquals(expectedList, vipList, "Test: VIP ArrayList contains expected values");
            entryPassesByName.clear();
            assertEquals(0, Application.getVIPList(entryPassesByName).size(), "Test: No VIP returns empty list");

        } catch (Exception e) {
            System.out.println(e.toString());
            fail("EntryPass and all setter/getter methods must be defined");
        }
    }
}