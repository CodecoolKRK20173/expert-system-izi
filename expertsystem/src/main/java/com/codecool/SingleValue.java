package com.codecool;


import java.util.ArrayList;

public class SingleValue extends Value{

    public SingleValue(String param, boolean selectionType){
        super.inputPattern= new ArrayList<>(1);
        super.inputPattern.add(param);
        super.selectionType=selectionType;
    }

    @Override
    public String toString() {
        return String.format("%s %b", inputPattern.get(0), selectionType);
    }
}