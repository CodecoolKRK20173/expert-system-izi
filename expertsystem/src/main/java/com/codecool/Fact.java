package com.codecool;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Fact {

    private final String ID;
    private final String DESCRIPTION;
    private Map<String, Boolean> valueId;


    Fact(String id, String description) {
        this.ID = id;
        this.DESCRIPTION = description;
        this.valueId = new HashMap<>();
    }


    Set<String> getSetId() {
        return this.valueId.keySet();
    }


    void setFactValueById(String id, boolean value) {
        this.valueId.put(id, value);
    }
    

    String getDescription() {
        return this.DESCRIPTION;
    }


    @Override
    public String toString() {
        return String.format("%s %s", ID, DESCRIPTION);
    }


    Map<String, Boolean> getValueId() {
        return valueId;
    }
}
