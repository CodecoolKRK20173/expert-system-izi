package com.codecool;

import java.util.List;


public abstract class Value {

    private boolean selectionType;
    private List<String> inputPattern;


    public List<String> getInputPattern(){
        return inputPattern;
    }


    public boolean getSelectionType(){
        return selectionType;
    }
}