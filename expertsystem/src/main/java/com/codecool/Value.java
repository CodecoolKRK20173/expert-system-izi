package com.codecool;


import java.util.List;

public abstract class Value {

    boolean selectionType;
    List<String> inputPattern;

    public List<String> getInputPattern(){
        return inputPattern;
    }

    public boolean getSelectionType(){
        return selectionType;
    }
}