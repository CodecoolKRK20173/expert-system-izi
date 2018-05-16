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


    public void setInputPattern(List<String> inputPattern) {
        this.inputPattern = inputPattern;
    }


    public void setSelectionType(boolean selectionType) {
        this.selectionType = selectionType;
    }
}