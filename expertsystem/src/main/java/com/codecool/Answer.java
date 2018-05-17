package com.codecool;

import java.util.ArrayList;
import java.util.List;


public class Answer{

    private List<Value> values = new ArrayList<>();


    void addValue(Value value){
        this.values.add(value);
    }


    boolean evaluateAnswerByInput(String input) throws IllegalArgumentException {

        for (Value value : values) {

            for (String word : value.getInputPattern()) {
                if (word.equals(input))
                    return value.getSelectionType();
            }
        }

        throw new IllegalArgumentException();
    }

    
    @Override
    public String toString() {
        return values.toString();
    }
}