package com.codecool;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Fact {

    private final String ID;
    private final String DESCRIPTION;
    private Map<String, Boolean> valueID;


    public Fact(String id, String description) {
        this.ID = id;
        this.DESCRIPTION = description;
        this.valueID = new HashMap<>();
    }


    public Set<String> getSetId() {
        return this.valueID.keySet();
    }


    public void setFactValueById(String id, boolean value) {
        this.valueID.put(id, value);
    }


    public boolean getValueById(String id) {
        return this.valueID.get(id);

    }


    public String getDescription() {
        return this.DESCRIPTION;
    }
}
