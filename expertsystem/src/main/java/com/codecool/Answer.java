package com.codecool;

import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.List;

public class Answer{

    public List<Value> values = new ArrayList<>();

    public void addValue(Value value){
        this.values.add(value);
    }

    public boolean evaluateAnswerByInput(String input) throws IllegalArgumentException {
        System.out.println(values);
        for (Value value : values) {
            System.out.println(value.getInputPattern()+ " | " + value.getSelectionType());
            for (String word : value.getInputPattern()) {
                if (word.equals(input)) {
                    return value.getSelectionType();
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public List<Value> getValues() {
        return values;
    }

    @Override
    public String toString() {
        return values.toString();
    }
}