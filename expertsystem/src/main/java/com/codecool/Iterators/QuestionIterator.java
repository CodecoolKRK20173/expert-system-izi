package com.codecool.Iterators;

import com.codecool.Fact;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QuestionIterator implements Iterator<Rule> {

    private List<Rule> rules;
    int indexPosition;


    public FactIterator(List<Rule> facts) {
        this.rulse = new ArrayList<>();
        this.indexPosition = 0;
    }


    @Override
    public boolean hasNext() {
        if(this.rules.size() != indexPosition)
            return true;

        this.indexPosition = 0;
        return false;
    }


    @Override
    public Rule next() {
        return this.rulse.get(indexPosition++);
    }
}