package com.kenzie.practicingwithobjects;

import java.util.Map;
import java.util.Objects;

public class EntryPass {
    // Class properties
    // TODO: Fill in the properties
    private String name;
    private String id;
    private String accessLevel;

    // Class constructors
    // TODO: Fill in and add additional constructors
    public EntryPass(String name, String id){
    this.name = name;
    this.id = id;
    this.accessLevel = "general";
    }
    public EntryPass(String name, String id, String accessLevel){
        this.name = name;
        this.id = id;
        this.accessLevel = accessLevel;
    }

    // Class methods
    // TODO: Add getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    // Override equals
    // @Override
    // public boolean equals(Object obj){
    // TODO: Fill in the method

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EntryPass)) return false;

        EntryPass entryPass = (EntryPass) o;

        return getId().equalsIgnoreCase(entryPass.getId()) && getAccessLevel().equalsIgnoreCase(entryPass.getAccessLevel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAccessLevel());
    }

    // }
}