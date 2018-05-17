package com.codecool;

import java.util.ArrayList;
import java.util.List;


abstract class Value {
    private List<String> inputPattern;
    private boolean selectionType;


    Value(boolean selectionType) {
        this.inputPattern = new ArrayList<>();
        this.selectionType = selectionType;
    }


    List<String> getInputPattern() {
        return this.inputPattern;
    }


    void setInputPattern(List<String> inputPattern) {
        this.inputPattern = inputPattern;
    }


    boolean getSelectionType() {
        return this.selectionType;
    }
}