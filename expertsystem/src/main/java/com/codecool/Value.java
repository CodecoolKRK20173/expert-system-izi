package com.codecool;

import java.util.ArrayList;
import java.util.List;


public abstract class Value {
    private List<String> inputPattern;
    private boolean selectionType;


    public Value(boolean selectionType) {
        this.inputPattern = new ArrayList<>();
        this.selectionType = selectionType;
    }


    public List<String> getInputPattern() {
        return this.inputPattern;
    }


    public void setInputPattern(List<String> inputPattern) {
        this.inputPattern = inputPattern;
    }


    public boolean getSelectionType() {
        return this.selectionType;
    }
}