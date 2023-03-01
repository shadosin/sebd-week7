package com.kenzie.supportingmaterials;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.HashMap;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PersonTest {

    @Test
    public void testOne() {
        Person person1 = new Person("Bruce","Wayne",30);
        Person person2 = new Person("Diana","Prince",50);
        Person person3 = new Person("Tony","Stark",31);

        // the diamond operator is used after new so you don't have to re-declare
        HashMap<String, Person> identityHashMap = new HashMap<>();

        // adding elements to our hashmap
        identityHashMap.put("Batman", person1);
        identityHashMap.put("Wonder Woman", person2);
        identityHashMap.put("Ironman", person3);

        // search for the key when the value matches the personOfInterest object
        Person personOfInterest = new Person("Bruce","Wayne",30);

        assert(identityHashMap.containsValue(personOfInterest));
    }
}
